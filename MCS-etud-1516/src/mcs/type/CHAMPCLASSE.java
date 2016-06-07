package mcs.type;

import mcs.tds.INFOFONC;

public class CHAMPCLASSE extends CHAMP {
	
	private String acces;
	
	private INFOFONC infofonc;

	public CHAMPCLASSE(String nom, DTYPE type, int dep, String acces ,INFOFONC infofonc) {
		super(nom, type, dep);
		this.acces = acces;
		this.infofonc = infofonc;
	}

}
