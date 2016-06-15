package mcs.type;

import mcs.tds.INFO;

public class CHAMP {
	private String nom;
	private int dep;
	private INFO info;
	private String acces;
	
	public CHAMP(String nom, INFO info, int dep) {
		super();
		this.nom = nom;
		this.info = info;
		this.dep = dep;
		this.acces = "def";
	}
	
	public CHAMP(String nom, INFO info, int dep, String acces) {
		super();
		this.nom = nom;
		this.info = info;
		this.dep = dep;
		this.acces = acces;
	}

	public String getNom() {
		return nom;
	}

	public INFO getInfo() {
		return info;
	}
	
	public DTYPE getType(){
		return info.getType();
	}

	public int getDep() {
		return dep;
	}
	
	public void setDep(int dep) {
		this.dep = dep;
	}

	public String toString() {
		return nom + ": " + info + " dep = " + dep;
	}

}
