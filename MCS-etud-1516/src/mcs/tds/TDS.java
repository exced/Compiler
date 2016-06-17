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
					i = e.getValue();
					if (tds.compareTypeTo(((INFOFONC) i).getParams())){
						return i;
					}
				}
			}
		}
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