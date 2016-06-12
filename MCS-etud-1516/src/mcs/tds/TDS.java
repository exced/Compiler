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

	/**
	 * La TDS parente
	 */
	private TDS parente;


	/**
	 * Constructeur pour une TDS sans parente
	 */
	public TDS() {
		this(null);
	}

	/**
	 * Constructeur pour une TDS fille de p
	 * 
	 * @param p
	 */
	public TDS(TDS p) {
		super();
		parente = p;
	}

	public TDS getParente() {
		return parente;
	}

	/**
	 * Recherche de n dans la TDS courante uniquement
	 * 
	 * @param n
	 * @return
	 */
	public INFO chercherLocalement(String n) {
		INFO i = null;
		if (get(n) instanceof INFONAMESPACE) {
			if (((INFONAMESPACE) get(n)).getUsed()){
				i = get(n);
			}
		}
		else {
			i = get(n);
		}
		return i;
	}
	
	/*
	 * chercher Localement Full Access -> aucune restriction d'accès lors de la recherche
	 * nécessaire lors du changement d'accès pour le "using"
	 */
	private INFO chercherLocalementFA(String n) {
		return get(n);
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
	
	public INFO chercherGlobalementFA(String n) {
		INFO i = chercherLocalementFA(n);
		if (i == null)
			if (parente != null)
				return parente.chercherGlobalement(n);
		return i;
	}	
	

	public INFO chercherNamespace(String n) {
		String[] strings = n.split(Pattern.quote("."));
		INFO i = null;
		TDS tds = this;
		// nom simple
		if (strings.length == 0){
			return tds.chercherLocalementFA(n) instanceof INFONAMESPACE ? tds.chercherLocalementFA(n) : null;
		}
		else {
			// nom composé
			for (String s : strings){
				i = tds.chercherLocalementFA(s);
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
		TDS tds = this.getParente();
		// nom simple + INFOCLASSE
		if (strings.length == 0){
			return tds.chercherGlobalementFA(n) instanceof INFOCLASSE ? tds.chercherGlobalementFA(n) : null;
		}
		else {
			// nom composé + INFONAMESPACE...S + INFOCLASSE
			for (int i = 0; i < strings.length - 1; i++){
				ins = ins + strings[i];
				if (i != strings.length - 2)
					ins = ins + ".";
			}
			inc = strings[strings.length - 1];
			System.out.println("ins : " + ins);
			System.out.println("inc : " + inc);
			info = tds.chercherNamespace(ins);
			if (info == null){
				System.out.println("info null");
				return null;
			}
			else {
				if (info instanceof INFONAMESPACE){
					tds = ((INFONAMESPACE) info).getContenu();
					System.out.println("tds : " + tds);
					info = tds.chercherClasse(inc);
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
		sb.append("Fin TDS\n");
		return sb.toString();

	}


}
