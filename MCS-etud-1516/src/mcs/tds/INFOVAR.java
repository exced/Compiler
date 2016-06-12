package mcs.tds;

import mcs.type.DTYPE;

/**
 * Cette classe décrit une variable locale : adresse et type
 * 
 * 
 */
public class INFOVAR extends INFO {
	
	protected int dep;
	private String acces;
	
	public INFOVAR(DTYPE t, int d) {
		super(t);
		dep = d;
		acces = "private";
	}

	public DTYPE getType() { return super.getType(); }

	public int getDep() { return dep; }

	public int getTaille() { return this.getType().getTaille(); }
	
	public String getAcces() { return acces; }
	
	public void setAcces(String acces) { this.acces = acces; }

	@Override
	public String toString() {
		return "INFOVAR [type=" + type.getNom() + ", dep=" + dep + "]";
	}

}
