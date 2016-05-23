package mcs.tds;

import mcs.gc.Emplacement;
import mcs.type.DTYPE;

/**
 * Cette classe décrit une variable locale : adresse et type
 * 
 * 
 */
public class INFOVAR extends INFO {
	
	protected Emplacement empl;
	
	public INFOVAR(DTYPE t, Emplacement e) {
		super(t);
		empl = e;
	}

	public DTYPE getType() { return super.getType(); }

	public Emplacement getEmpl() { return empl; }

	public int getTaille() { return this.getType().getTaille(); }

	@Override
	public String toString() {
		return "INFOVAR [type=" + type.getNom() + ", empl=" + empl + "]";
	}

}
