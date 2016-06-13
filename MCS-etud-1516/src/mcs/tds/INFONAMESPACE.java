package mcs.tds;
import mcs.type.*;

public class INFONAMESPACE extends INFO {

	protected TDS tdsContenu;
	
	public INFONAMESPACE(DTYPE t, TDS tds){
		super(t);
		tdsContenu = tds;
	}
	
	public TDS getContenu() { return tdsContenu; }
	
	
	public String toString() {
		return "INFONAMESPACE ";
	}	
	
}
