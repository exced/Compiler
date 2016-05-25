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
	private Register previous;

	/**
	 * @param name
	 * @param dep
	 * @param previous
	 */
	public Register(String name, int dep, Register previous) {
		super();
		this.name = name;
		this.dep = dep;
		this.previous = previous;
	}

	public String getName() { return name; }

	public int getDep() { return dep; }
	
	public Register getPrevious(){
		return this.previous;
	}
	
	public void depRegister(int d) {
		dep += d;
	}

	@Override
	public String toString() {
		return "Register [name=" + name + ", dep=" + dep + "]";
	}

}
