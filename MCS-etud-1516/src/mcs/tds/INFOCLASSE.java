package mcs.tds;
import mcs.type.*;

public class INFOCLASSE extends INFO {
	
	protected String acces;

	protected INFOINTERFACE einterface;
	
	protected INFOCLASSE esuper;
	
	protected TDS tdsContenu;
	
	protected TDS tv;
	
	public INFOCLASSE(DTYPE t, String acces, TDS tdsContenu, INFOINTERFACE einterface, INFOCLASSE esuper){
		super(t);
		this.acces = acces;
		this.tdsContenu = tdsContenu;
		this.einterface = einterface;
		this.esuper = esuper;
	}
	
	public String getAcces() { return acces; }
	
	public TDS getContenu() { return tdsContenu; }
	
	public INFOINTERFACE getInterface() { return einterface; }
	
	public INFOCLASSE getSuper() { return esuper; }
	
	public TDS getTV() { return tv; }
	
	public String toString() {
		return "INFOCLASSE : contenu => " + tdsContenu+
				"\n interface => " + einterface;
	}	
	
}
