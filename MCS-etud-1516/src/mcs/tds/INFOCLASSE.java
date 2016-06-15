package mcs.tds;
import mcs.type.*;

public class INFOCLASSE extends INFO {
	
	protected String acces;

	protected INFOCLASSE parente;
	
	protected TDS contenu;
	
	
	public INFOCLASSE(String acces, TDS contenu, INFOCLASSE parente){
		super(new POINTEUR(new STRUCT(contenu.toChamps())));
		this.acces = acces;
		this.parente = parente;
		this.contenu = contenu;
	}
	
	public INFOCLASSE( String acces, TDS contenu){
		super(new POINTEUR(new STRUCT(contenu.toChamps())));
		this.acces = acces;
		this.parente = null;
		this.contenu = contenu;
	}
	
	public String getAcces() { return acces; }
	
	public INFOCLASSE getParente() { return parente; }
	
	public TDS getContenu() { return contenu; }
	
	
	public String toString() {
		return "INFOCLASSE ";
	}	
	
}
