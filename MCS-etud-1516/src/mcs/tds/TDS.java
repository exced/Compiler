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
	 * une TDS connait la classe dont elle est le contenu 
	 */
	private INFOCLASSE classeContainer;

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
		classeContainer = null;
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
		classeContainer = null;
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
		Set<Map.Entry<String, INFO>> s = this.entrySet();
		for (Map.Entry<String, INFO> e : s) {
			i = e.getValue();
			if (i instanceof INFOFONC){
				if (e.getKey().equals(n) && ((INFOFONC) i).getParams().compareTypeTo(tds)){
					return i;
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

	/*
	 * Recherche de n dans la TDS courante + la liste des Infonamespace importées
	 * on recherche d'abord dans la liste des NS imported
	 */
	public INFO chercherLocalementNS(String n) {
		return chercherUsedNS(n) != null ? chercherUsedNS(n) : get(n);
	}

	/*
	 * Recherche de n dans la TDS courante et ses parentes + la liste des Infonamespace importées
	 */
	public INFO chercherGlobalementNS(String n) {
		INFO i = chercherLocalementNS(n);
		if (i == null)
			if (parente != null)
				return parente.chercherGlobalementNS(n);
		return i;
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
		String ins = "";
		String inc;
		INFO info = null;
		TDS tds = this;
		// nom simple + INFOCLASSE
		if (strings.length == 1){
			return tds.chercherGlobalementNS(n) instanceof INFOCLASSE ? tds.chercherGlobalementNS(n) : null;
		}
		else {
			// nom composé + INFONAMESPACE...S + INFOCLASSE
			for (int i = 0; i < strings.length - 1; i++){
				ins = ins + strings[i];
				if (i != strings.length - 2)
					ins = ins + ".";
			}
			inc = strings[strings.length - 1];
			info = tds.chercherNamespace(ins);
			if (info == null){
				return null;
			}
			else {
				if (info instanceof INFONAMESPACE){
					tds = ((INFONAMESPACE) info).getContenu();
					info = tds.chercherLocalement(inc);
				}
				else {
					return null;
				}
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

	public INFOCLASSE getClasseContainer() { return classeContainer; }


	public INFOCLASSE getClasseContainerRec() {
		INFOCLASSE classeContainer = this.classeContainer;
		if (classeContainer == null)
			if (parente != null)
				return parente.getClasseContainerRec();
		return classeContainer; 
	}

	public void setClasseContainer(INFOCLASSE classeContainer) { this.classeContainer = classeContainer; } 


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
			if (e.getValue() instanceof INFOVAR)
				lch.inserer(new CHAMP(e.getKey(), e.getValue(), dep++));
		}
		return lch;
	}

}
