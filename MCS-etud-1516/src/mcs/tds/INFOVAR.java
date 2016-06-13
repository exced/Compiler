package mcs.tds;

import mcs.type.DTYPE;
import mcs.gc.*;

/**
 * Cette classe décrit une variable locale : adresse et type
 * 
 * 
 */
public class INFOVAR extends INFO {
	
	protected Emplacement empl;
	
	private String acces;
	
	public INFOVAR(DTYPE t, int d) {
		super(t);
		empl = new Emplacement(d, new Register("LB",0));
		acces = "private";
	}
	
	public INFOVAR(DTYPE t, int d, String reg) {
		super(t);
		empl = new Emplacement(d, new Register(reg,0));
		acces = "private";
	}

	public DTYPE getType() { return super.getType(); }

	public int getDep() { return empl.getDep(); }
	
	public Emplacement getEmpl() { return empl; }

	public int getTaille() { return this.getType().getTaille(); }
	
	public String getAcces() { return acces; }
	
	public void setAcces(String acces) { this.acces = acces; }

	@Override
	public String toString() {
		return "INFOVAR [type=" + type.getNom() + ", dep=" + empl.getDep() + "]";
	}

}
