package mcs.tds;
import mcs.type.*;

public class INFOCLASSE extends INFO {
	
	protected String acces;

	protected INFOCLASSE parente;
	
	protected TDS contenu;
	
	protected INFONAMESPACE parent;
	
	
	public INFOCLASSE(String acces, TDS contenu, INFOCLASSE parente){
		super(new POINTEUR(new STRUCT(contenu.toChamps())));
		this.acces = acces;
		this.parente = parente;
		this.contenu = contenu;
		parent = null;
	}
	
	public INFOCLASSE( String acces, TDS contenu){
		super(new POINTEUR(new STRUCT(contenu.toChamps())));
		this.acces = acces;
		this.parente = null;
		this.contenu = contenu;
		parent = null;
	}
	
	public INFOCLASSE(String acces, TDS contenu, INFOCLASSE parente, INFONAMESPACE parent){
		super(new POINTEUR(new STRUCT(contenu.toChamps())));
		this.acces = acces;
		this.parente = parente;
		this.contenu = contenu;
		this.parent = parent;
	}
	
	public INFOCLASSE( String acces, TDS contenu, INFONAMESPACE parent){
		super(new POINTEUR(new STRUCT(contenu.toChamps())));
		this.acces = acces;
		this.parente = null;
		this.contenu = contenu;
		this.parent = parent;
	}
	
	public String getAcces() { return acces; }
	
	public INFOCLASSE getParente() { return parente; }
	
	public TDS getContenu() { return contenu; }
	
	public INFONAMESPACE getNSParent() { return parent; }
	
	
	public String toString() {
		return "INFOCLASSE " ;
	}	
	
}
