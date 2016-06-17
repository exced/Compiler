package mcs.tds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import mcs.type.*;


/**
 * une TDS hiérarchique.
 */
public class TDS extends LinkedHashMap<String, INFO> {

	private static final long serialVersionUID = 1L;

	private TDS parente;


	/**
	 * liste des namespace used (using)
	 */
	private LinkedHashMap<String, INFONAMESPACE> usedNS;

	/**
	 * Constructeur pour une TDS sans parente
	 */
	public TDS() {
		this(null);
		usedNS = new LinkedHashMap<String, INFONAMESPACE>();
	}

	/**
	 * Constructeur pour une TDS fille de p
	 * 
	 * @param p
	 */
	public TDS(TDS p) {
		super();
		parente = p;
		usedNS = new LinkedHashMap<String, INFONAMESPACE>();
	}


	public TDS getParente() {
		return parente;
	}

	public void addUsedNS(String n, INFONAMESPACE ins){
		usedNS.put(n,ins);
	}

	/**
	 * Recherche de n dans la TDS courante uniquement
	 * 
	 * @param n
	 * @return
	 */
	public INFO chercherLocalement(String n) {
		return get(n);
	}

	/**
	 * recherche de fonction
	 * @param n
	 * @param tds des PARAMS
	 * @return
	 */
	public INFO chercherLocalementFonc(String n, TDS tds) {
		INFO i = null;
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s) {
			if (e.getKey().equals(n)){
				if (e.getValue() instanceof INFOFONC){
					if (((INFOFONC) i).getParams().compareTypeTo(tds)){
						return i;
					}
				}
			}
		}
		return i;
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public INFO chercherLocalementClasse(String n) {
		return get(n) instanceof INFOCLASSE ? get(n) : null;
	}

	/**
	 * chercher un constructeur
	 */
	public INFO chercherLocalement(DTYPE t, TDS tds){
		INFO i = null;
		ArrayList<INFO> constructeurs = new ArrayList<INFO>();
		for (INFO in : values()){
			if (in.getType().equals(t)) {
				constructeurs.add(in);
			}
		}
		// prendre celui qui match avec la TDS des params d'appel
		for (INFO cs : constructeurs){
			if (cs instanceof INFOFONC){
				if (((INFOFONC) cs).getParams().compareTypeTo(tds)){
					// match params OK
					i = cs;
					break;
				}
			}
		}
		return i;
	}

	/**
	 * Recherche de n dans la TDS courante et ses parentes.
	 * 
	 * @param n
	 * @return
	 */
	public INFO chercherGlobalement(String n) {
		INFO i = chercherLocalement(n);
		if (i == null)
			if (parente != null)
				return parente.chercherGlobalement(n);
		return i;
	}

	/**
	 * Recherche de la fonction n dans la TDS courante et ses parentes.
	 * @param n
	 * @param tds
	 * @return
	 */
	public INFO chercherGlobalementFonc(String n, TDS tds) {
		INFO i = chercherLocalementFonc(n, tds);
		if (i == null)
			if (parente != null)
				return parente.chercherGlobalementFonc(n, tds);
		return i;
	}

	/*
	 * Recherche d'un Namespace à partir des namespaces imported
	 */
	public INFO chercherUsedNS(String n){
		INFO i = null;
		Set<Map.Entry<String, INFONAMESPACE>> s = usedNS.entrySet();
		for (Map.Entry<String, INFONAMESPACE> e : s) {
			if (e.getKey().equals(n)) {
				i = e.getValue();
				break;
			}
			else {
				if (e.getValue().getContenu().chercherLocalement(n) != null) {
					i = e.getValue().getContenu().chercherLocalement(n);
					break;
				}
			}
		}
		return i;
	}


	public INFO chercherLocalementCL(String n) {
		return (get(n) instanceof INFOCLASSE) ? get(n) : null;
	}


	public INFO chercherGlobalementCL(String n) {
		INFO i = chercherLocalementCL(n);
		System.out.println("chercherGlobalement " + i + this);
		if (i == null)
			if (parente != null)
				return parente.chercherGlobalementCL(n);
		return i;
	}

	public INFO chercherLocalementNS(String n) {
		return (get(n) instanceof INFONAMESPACE) ? get(n) : null;
	}


	public INFO chercherGlobalementNS(String n) {
		INFO i = chercherLocalementCL(n);
		if (i == null)
			if (parente != null)
				return parente.chercherGlobalementCL(n);
		return i;
	}


	public TDS chercherGlobalementNSTDS(String n) {
		TDS t = null;
		INFO i = chercherLocalementCL(n);
		if (i == null){
			if (parente != null){
				i = parente.chercherGlobalementCL(n);
			}
		}
		else {
			t = this;
		}
		return t;
	}



	/*
	 * chercher un namespace, nécessaire pour le using
	 */
	public INFO chercherNamespace(String n) {
		String[] strings = n.split(Pattern.quote("."));
		INFO i = null;
		TDS tds = this;
		// nom simple
		if (strings.length == 1){
			return tds.chercherGlobalementNS(n) instanceof INFONAMESPACE ? tds.chercherGlobalementNS(n) : null;
		}
		else {
			// nom composé
			for (String s : strings){
				System.out.println("chercherNS sur : " + s);
				i = tds.chercherGlobalementNS(s);
				if (i == null){
					return null;
				}
				else {
					if (i instanceof INFONAMESPACE){
						tds = ((INFONAMESPACE) i).getContenu();
					}
					else {
						return null;
					}
				}
			}
		}
		return i;
	}


	public INFO chercherClasse(String n){
		String[] strings = n.split(Pattern.quote("."));
		System.out.println("chercher classe sur : " + n);
		String ins = "";
		String inc;
		INFO info = null;
		TDS tds = this;
		// nom simple + INFOCLASSE
		if (strings.length == 1){
			System.out.println("chercher classe " + strings[0]);
			return tds.chercherGlobalementCL(n) instanceof INFOCLASSE ? tds.chercherGlobalementCL(n) : null;
		}
		else {
			tds = chercherGlobalementNSTDS(strings[0]);
			// nom composé + INFONAMESPACE...S.. 
			for (int i = 1; i < strings.length - 1; i++){
				info = tds.chercherLocalementNS(strings[i]);
				if (info != null && info instanceof INFONAMESPACE){
					tds = ((INFONAMESPACE) info).getContenu();
				}
				else {
					return null;
				}
			}
			//.. + INFOCLASSE
			System.out.println("NAMESPACE FOUND " + info);
			info = tds.chercherLocalementNS(strings[strings.length - 1]);
			if (info != null && info instanceof INFOCLASSE){
				System.out.println("CLASSE FOUND " + info);
				return info;
			}
		}
		return info;
	}


	/**
	 * Ajoute le nom n et son information i dans la TDS
	 * 
	 * @param n
	 * @param i
	 * @throws Exception 
	 */
	public void inserer(String n, INFO i){
		put(n, i);
	}

	public boolean compareTypeTo(TDS tdsParam){
		boolean b = true;
		DTYPE t = null;
		Iterator it = tdsParam.values().iterator();
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s) {
			if (it.hasNext()){
				t = ((INFO) it.next()).getType();
				b = b && e.getValue().getType().compareTo(t);
			}else{
				b = false;
				break;
			}

		}
		return b;
	}


	public int getTailleParams() {
		int taille = 0;
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s) {
			taille+=e.getValue().getType().getTaille();
		}
		return taille;
	}


	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Debut TDS \n");
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s) {
			sb.append("Ident : " + e.getKey() + "  Type : " + e.getValue().toString() + '\n');
		}
		for (String ss : usedNS.keySet()) {
			sb.append("NS imported : " + ss + "\n");
		}
		sb.append("Fin TDS\n");
		return sb.toString();

	}

	/**
	 * transforme une TDS en champs en respectant les principes d'une classe
	 * @return
	 */
	public LCHAMPS toChamps() {
		LCHAMPS lch = new LCHAMPS();
		int dep = 0;
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s) {
			if (e.getValue() instanceof INFOVAR || e.getValue() instanceof INFOFONC)
				lch.inserer(new CHAMP(e.getKey(), e.getValue(), dep++));
		}
		return lch;
	}

}