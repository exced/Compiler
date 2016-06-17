package mcs.type;

import mcs.tds.INFOCLASSE;

public class OBJET implements DTYPE{

	protected String nom;
	
	protected INFOCLASSE infoclasse;
	
	public OBJET(String nom, INFOCLASSE info){
		this.nom = nom;
		this.infoclasse = info;
	}
	
	@Override
	public int getTaille() {
		return 1;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public boolean compareTo(DTYPE autre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean compareOpUn(DTYPE op) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean compareOpBin(DTYPE op, DTYPE b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCastableAs(DTYPE t) {
		// TODO Auto-generated method stub
		return false;
	}

}
