package mcs.gc;

/**
 * Cette classe décrit un registre d'une machine
 * 
 * @author marcel
 */
public class Register {
	private String name;
	// position absolue ( par rapport à SB )
	private int dep;

	/**
	 * @param name
	 * @param dep
	 * @param previous
	 */
	public Register(String name, int dep) {
		super();
		this.name = name;
		this.dep = dep;
	}

	public String getName() { return name; }

	public int getDep() { return dep; }
	
	public void depRegister(int d) {
		dep += d;
	}

	@Override
	public String toString() {
		return "Register [name=" + name + ", dep=" + dep + "]";
	}

}
