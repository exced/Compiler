package mcs.tds;
import mcs.type.*;

public class INFOFONC extends INFO {

	protected TDS tdsParam;
	
	private String acces;
	
	public INFOFONC(DTYPE t, TDS tds){
		super(t);
		tdsParam = tds;
		acces = "def";
	}
	
	public TDS getParams() { return tdsParam; }
	
	public String getAcces() { return acces; }
	
	public void setAcces(String acces) { this.acces = acces; }
	
	public String toString() {
		return "INFOFONC : fonction => " + type.getNom() + ", acces : " + acces;
	}	
	
}
