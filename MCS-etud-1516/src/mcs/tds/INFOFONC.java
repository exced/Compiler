package mcs.tds;
import mcs.type.*;

public class INFOFONC extends INFO {

	protected TDS tdsParam;
	
	public INFOFONC(DTYPE t, TDS tds){
		super(t);
		tdsParam = tds;
	}
	
	public TDS getParams() { return tdsParam; }
	
	public String toString() {
		return "INFOFONC : fonction => " + type.getNom();
	}	
	
}
