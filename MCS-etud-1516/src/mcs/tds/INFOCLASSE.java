package mcs.tds;
import mcs.type.*;

public class INFOCLASSE extends INFO {
	
	protected String acces;

	protected INFOCLASSE parente;
	
	protected TDS tdsContenu;
	
	protected TDS tv;
	
	public INFOCLASSE(LCHAMPS champs, String acces, TDS tdsContenu, INFOCLASSE parente){
		super(new POINTEUR(new STRUCT(champs)));
		this.acces = acces;
		this.tdsContenu = tdsContenu;
		this.parente = parente;
	}
	
	public String getAcces() { return acces; }
	
	public TDS getContenu() { return tdsContenu; }
	
	public INFOCLASSE getParente() { return parente; }
	
	public TDS getTV() { return tv; }
	
	public String toString() {
		return "INFOCLASSE : contenu => " + tdsContenu+
				"\n parente => " + parente;
	}	
	
}
