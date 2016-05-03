package mcs.gc;

/**
 * Cette classe decrit une adresse mémoire (déplacement par rapport à un
 * registre)
 * 
 * @author marcel
 * 
 * 
 */
public class Emplacement {
	private int dep;

	private Register reg;

	public int getDep() {
		return dep;
	}

	public Register getReg() {
		return reg;
	}

	@Override
	public String toString() {
		return "[" + dep + "/" + reg + "]";
	}

	/**
	 * Emplacement = adresse = deplacement / registre.
	 * @param dep
	 * @param reg
	 */
	public Emplacement(int dep, Register reg) {
		super();
		this.dep = dep;
		this.reg = reg;
	}

}
