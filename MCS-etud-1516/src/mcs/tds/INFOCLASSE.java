package mcs.tds;
import mcs.type.*;

public class INFOCLASSE extends INFO {

	protected INFOINTERFACE einterface;
	
	protected INFOCLASSE esuper;
	
	protected TDS tdsContenu;
	
	protected TDS tv;
	
	public INFOCLASSE(DTYPE t, TDS tds, INFOINTERFACE i){
		super(t);
		tdsContenu = tds;
		einterface = i;
	}
	
	public TDS getContenu() { return tdsContenu; }
	
	public INFOINTERFACE getInterface() { return einterface; }
	
	public INFOCLASSE getSuper() { return esuper; }
	
	public TDS getTV() { return tv; }
	
	public String toString() {
		return "INFOCLASSE : contenu => " + tdsContenu+
				"\n interface => " + einterface;
	}	
	
}
