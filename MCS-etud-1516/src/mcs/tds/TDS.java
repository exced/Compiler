package mcs.tds;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import mcs.exception.*;

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

	/**
	 * Ajoute le nom n et son information i dans la TDS
	 * 
	 * @param n
	 * @param i
	 * @throws Exception 
	 */
	public void inserer(String n, INFO i) throws Exception{
		if(get(n) != null){
			put(n, i);
		}else{
			throw EExistantArgument(n + "variable already defined");
		}
			
	}
	
	private Exception EExistantArgument(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTailleParams() {
		int taille = 0;
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s) {
			taille+=e.getValue().getType().getTaille();

		}
		return taille;
	}
	
	public int getTailleRetour() {
		return (get("TOKEN_retourFonction") == null) ? 0 : get("TOKEN_retourFonction").getType().getTaille();
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s) {
			sb.append("; " + e.getKey() + " : " + e.getValue() + '\n');

		}
		return sb.toString();
	}

}
