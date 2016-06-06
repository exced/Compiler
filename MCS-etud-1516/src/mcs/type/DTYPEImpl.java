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
	
	public boolean compareOpUn(DTYPE op) {
		
		boolean res = false;
		
		if(op.getNom().equals("OPUNPLUS") || op.getNom().equals("OPUNMOINS")){
			res = this.getNom().equals("int");
		}
		
		if(op.getNom().equals("OPUNNON")){
			res = this.getNom().equals("bool");
		}
		
		return res;
	}

	public boolean compareOpBin(DTYPE op, DTYPE b) {

		boolean res = false;

		if (op.getNom().equals("OPRELNEG") || op.getNom().equals("OPRELEG")) {
			res = this.compareTo(b);
		}

		else if (op.getNom().equals("OPRELSUPEG") || op.getNom().equals("OPRELINFEG") || op.getNom().equals("OPRELSUP")
				|| op.getNom().equals("OPRELINF")) {
			res = (this.getNom().equals("int") && this.compareTo(b));
		}

		else if (op.getNom().equals("OPADDPLUS") || op.getNom().equals("OPADDMOINS") || op.getNom().equals("OPADDOU")) {
			res = (this.getNom().equals("int") && this.compareTo(b));
		} 
		
		else if (op.getNom().equals("OPMULMULT") || op.getNom().equals("OPMULDIV") || op.getNom().equals("OPMULMOD")
				|| op.getNom().equals("OPMULET")) {
			res = (this.getNom().equals("int") && this.compareTo(b));
		}

		return res;
	}
	
	public boolean isCastableAs(DTYPE t){
		boolean res = false;
		
		//TODO
		
		return true;
	}

}

