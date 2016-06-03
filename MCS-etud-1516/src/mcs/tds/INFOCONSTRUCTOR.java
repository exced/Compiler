package mcs.tds;
import mcs.type.*;

public class INFOCONSTRUCTOR extends INFO {

	protected TDS tdsParam;
	
	public INFOCONSTRUCTOR(TDS tds){
		super(null);
		tdsParam = tds;
	}
	
	public TDS getParams() { return tdsParam; }
	
	public String toString() {
		return "INFOCONSTRUCTOR : fonction => NULL";
	}	
	
}
