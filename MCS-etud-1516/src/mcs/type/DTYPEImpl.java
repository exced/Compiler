package mcs.type;

public class DTYPEImpl implements DTYPE {
	
	protected int taille;
	protected String nom;

	public DTYPEImpl(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}

	@Override
	public int getTaille() {
		return taille;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public boolean compareTo(DTYPE autre) {
		return nom.equals(autre.getNom());
	}

}
