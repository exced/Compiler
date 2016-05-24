package mcs.tds;

import mcs.type.DTYPE;

/**
 * Cette classe décrit une variable locale : adresse et type
 * 
 * 
 */
public class INFOVAR extends INFO {
	
	protected int dep;
	
	public INFOVAR(DTYPE t, int d) {
		super(t);
		dep = d;
	}

	public DTYPE getType() { return super.getType(); }

	public int getDep() { return dep; }

	public int getTaille() { return this.getType().getTaille(); }

	@Override
	public String toString() {
		return "INFOVAR [type=" + type.getNom() + ", dep=" + dep + "]";
	}

}
