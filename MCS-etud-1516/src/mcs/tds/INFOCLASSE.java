package mcs.tds;
import mcs.type.*;

public class INFOCLASSE extends INFO {
	
	protected String acces;

	protected INFOCLASSE parente;
	
	protected LCHAMPS champsClasse;
	
	public INFOCLASSE(LCHAMPS champs, String acces, INFOCLASSE parente){
		super(new POINTEUR(new STRUCT(champs)));
		this.acces = acces;
		this.champsClasse = champs;
		this.parente = parente;
	}
	
	public INFOCLASSE(LCHAMPS champs, String acces){
		super(new POINTEUR(new STRUCT(champs)));
		this.acces = acces;
		this.champsClasse = champs;
		this.parente = null;
	}
	
	public String getAcces() { return acces; }
	
	public INFOCLASSE getParente() { return parente; }
	
	/**
	 * transforme le contenu d'une classe en LCHAMPS
	 */
	public LCHAMPS getChampsClasse() {
		return champsClasse;
	}
	
	public String toString() {
		return "INFOCLASSE ";
	}	
	
}
