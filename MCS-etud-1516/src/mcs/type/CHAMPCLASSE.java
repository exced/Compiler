package mcs.type;

import mcs.tds.*;

public class CHAMPCLASSE extends CHAMP {
	
	private String acces;
	
	private INFO info;

	public CHAMPCLASSE(String nom, String acces, int dep, INFO info) {
		super(nom, info.getType(), dep);
		this.acces = acces;
		this.info = info;
	}

}
