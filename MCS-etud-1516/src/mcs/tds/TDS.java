package mcs.tds;

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
	
	/*
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
	 * chercher localement par type (utile pour obtenir un constructeur par exemple)
	 */
	public INFO chercherLocalement(DTYPE t){
		INFO i = null;
		for (INFO in : values()){
			i = in.getType().equals(t) ? in : null;	
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
	
	/*
	 * Recherche d'un Namespace à partir des namespaces imported
	 */
	public INFO chercherUsedNS(String n){
		INFO i = null;
		for (INFONAMESPACE ins : usedNS.values()){
			i = ins.getContenu().chercherLocalement(n);
			if (i != null)
				break;
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
