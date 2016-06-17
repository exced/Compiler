package mcs.tds;
import mcs.type.*;

public class INFOFONC extends INFO {

	protected TDS tdsParam;
	
	private String acces;
	
	private String etq;
	
	public INFOFONC(DTYPE t, TDS tds){
		super(t);
		tdsParam = tds;
		acces = "def";
		etq = "";
	}
	
	public INFOFONC(DTYPE t, TDS tds, String etq){
		super(t);
		tdsParam = tds;
		acces = "def";
		this.etq = etq;
	}
	
	
	
	public TDS getParams() { return tdsParam; }
	
	public String getAcces() { return acces; }
	
	public void setAcces(String acces) { this.acces = acces; }
	
	public String getEtq() { return etq; }
	
	public String toString() {
		return "INFOFONC : fonction => " + type.getNom() + ", acces : " + acces;
	}	
	
}
