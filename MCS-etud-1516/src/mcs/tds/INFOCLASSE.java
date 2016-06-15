package mcs.tds;
import mcs.type.*;

public class INFOCLASSE extends INFO {
	
	protected String acces;

	protected INFOCLASSE parente;
	
	/**
	 * dualité champsClasse / contenu : les champs représentent la meme chose que les variables de la tds
	 */
	protected LCHAMPS champsClasse;
	
	protected TDS contenu;
	
	
	public INFOCLASSE(LCHAMPS champs, String acces, INFOCLASSE parente, TDS contenu){
		super(new POINTEUR(new STRUCT(champs)));
		this.acces = acces;
		this.champsClasse = champs;
		this.parente = parente;
		this.contenu = contenu;
	}
	
	public INFOCLASSE(LCHAMPS champs, String acces, TDS contenu){
		super(new POINTEUR(new STRUCT(champs)));
		this.acces = acces;
		this.champsClasse = champs;
		this.parente = null;
		this.contenu = contenu;
	}
	
	public String getAcces() { return acces; }
	
	public INFOCLASSE getParente() { return parente; }
	
	public TDS getContenu() { return contenu; }
	
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
