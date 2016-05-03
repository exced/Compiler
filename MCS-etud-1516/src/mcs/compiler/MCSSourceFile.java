package mcs.compiler;

import mcs.gc.AbstractMachine;
import mcs.gc.MTAM;
import mg.egg.eggc.runtime.libjava.SourceUnit;

/**
 * Decrit une unite de compilation MCS
 * @author marcel
 *
 */
public class MCSSourceFile extends SourceUnit {
	// obligatoire pour un SourceUnit : le nom du fichier
	private String fileName;
	// la machine cible
	private AbstractMachine machine;
	private String machName;

	public MCSSourceFile(String[] args) throws MCSException {
		super(args[0]);
		// d'autres arguments ?
		analyze(args);
	}

	/**
	 * Affiche les options disponibles
	 * 
	 * @param a
	 * @throws MCSException
	 */
	private void usage(String a) throws MCSException {
		throw new MCSException("Option incorrecte : " + a + ". "
				+ Messages.getString("MCS.usage"));
	}

	/**
	 * Analyse les arguments supplementaires du compilateur
	 * 
	 * @param args
	 * @throws MCSException
	 */
	public void analyze(String[] args) throws MCSException {
		int argc = args.length;
		// nom du fichier
		fileName = args[0];
		// machine cible ?
		if (argc == 1) {
			// machine tam par defaut
			setMachine("tam");
		} else {
			// nom de la machine ?
			for (int i = 1; i < argc; i++) {
				String a = args[i];
				if ("-m".equals(a)) { //$NON-NLS-1$
					if (i + 1 < argc) {
						i++;
						setMachine(args[i]);
					} else
						usage(a);
				} else {
					usage(a);
				}
			}
		}
	}

	/**
	 * Fixe et CREE la machine cible
	 * 
	 * @param mach
	 */
	private void setMachine(String mach) {
		// System.err.println("mach " + mach);
		machName = mach;
		if ("tam".equals(mach)) {
			machine = new MTAM();
		} else {
			// TODO si la machine n'est pas tam
			// machine = new ???();
		}
	}

	public AbstractMachine getMachine() {
		return machine;
	}

	public String getMachName() {
		return machName;
	}

	public String getFileName() {
		return fileName;
	}

}
