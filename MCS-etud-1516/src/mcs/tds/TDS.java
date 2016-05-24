package mcs.tds;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

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
	public void inserer(String n, INFO i){
		put(n, i);
	}
	

	public int getTailleParams() {
		int taille = 0;
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s) {
			taille+=e.getValue().getType().getTaille();
		}
		return taille;
	}
	
	
	public String indent( int indent){
		StringBuffer sindent = new StringBuffer();
		for (int i = 0; i < indent; i++){
			sindent.append("\t");
		}
		return sindent.toString();
	}

	public String toString(int indent) {
		
		StringBuffer sb = new StringBuffer();
		sb.append(indent(indent) +"Debut TDS \n");
		
		String p = (parente == null) ? indent(indent) + "parente null\n" : parente.toString(++indent) + "\n";
		sb.append( p );
		
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s) {
			sb.append(indent(indent) + "Ident : " + e.getKey() + "  Type : " + e.getValue().toString() + '\n');
		}
		sb.append(indent(indent) + "Fin TDS\n");
		return sb.toString();
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
