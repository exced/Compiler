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
	
	private String mode;
	
	public INFOVAR(DTYPE t, int d) {
		super(t);
		empl = new Emplacement(d, new Register("LB",0));
		acces = "def";
		mode = "inout";
	}
	
	public INFOVAR(DTYPE t, int d, String reg) {
		super(t);
		empl = new Emplacement(d, new Register(reg,0));
		acces = "def";
		mode = "inout";
	}

	public DTYPE getType() { return super.getType(); }

	public int getDep() { return empl.getDep(); }
	
	public Emplacement getEmpl() { return empl; }

	public int getTaille() { return this.getType().getTaille(); }
	
	public String getAcces() { return acces; }
	
	public void setAcces(String acces) { this.acces = acces; }
	
	public String getMode() { return mode; }
	
	public void setMode(String mode) { this.mode = mode; }

	@Override
	public String toString() {
		return "INFOVAR [type=" + type.getNom() + ", dep=" + empl.getDep() + "], acces : " + acces;
	}

	public boolean matchMode(String cote){
		// Erreur si à gauche et de type in, ou si à droite et de type out
		return !((cote.equals("gauche") && this.mode.equals("in")) || (cote.equals("droite") && this.mode.equals("out")));
	}
	
	
}
