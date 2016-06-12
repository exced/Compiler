package mcs.tds;
import mcs.type.*;

public class INFONAMESPACE extends INFO {

	private boolean used;
	protected TDS tdsContenu;
	
	public INFONAMESPACE(DTYPE t, TDS tds){
		super(t);
		tdsContenu = tds;
		used = false;
	}
	
	public TDS getContenu() { return tdsContenu; }
	
	public boolean getUsed() { return used; }
	
	public void setUsed(boolean b) { used = b; }
	
	public String toString() {
		return "INFONAMESPACE , used : " + used;
	}	
	
}
