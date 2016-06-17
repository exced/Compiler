package mcs.tds;
import mcs.type.*;

public class INFONAMESPACE extends INFO {

	protected TDS tdsContenu;
	
	protected INFONAMESPACE parent;
	
	public INFONAMESPACE(DTYPE t) {
		super(t);
		tdsContenu = null;
		parent = null;
	}
	
	public INFONAMESPACE(DTYPE t, INFONAMESPACE parent) {
		super(t);
		tdsContenu = null;
		this.parent = parent;
	}
	
	public INFONAMESPACE(DTYPE t, TDS tds){
		super(t);
		tdsContenu = tds;
		parent = null;
	}
	
	public INFONAMESPACE(DTYPE t, TDS tds, INFONAMESPACE parent){
		super(t);
		tdsContenu = tds;
		this.parent = parent;
	}	
	
	public TDS getContenu() { return tdsContenu; }
	
	public void setContenu(TDS tds) { this.tdsContenu = tds; }
	
	
	public String toString() {
		return "INFONAMESPACE" ;
	}

	public INFONAMESPACE getNSParent() {
		return parent;
	}	
	
}
