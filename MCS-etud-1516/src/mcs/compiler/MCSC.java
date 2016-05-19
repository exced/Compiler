package mcs.compiler;

import java.io.Serializable;

import mcs.egg.MCS;
import mg.egg.eggc.runtime.libjava.ISourceUnit;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import mg.egg.eggc.runtime.libjava.problem.ProblemReporter;
import mg.egg.eggc.runtime.libjava.problem.ProblemRequestor;

/**
 * La classe principale du compilateur MCS engendré Usage MCSC fichier.MCS
 * options.
 * 
 * @author marcel
 * 
 */
public class MCSC implements Serializable {
	private static final long serialVersionUID = 1L;

	private static void checkFile(String[] args) throws MCSException {
		if (args.length == 0) {
			throw new MCSException(Messages.getString("MCS.fileError"));
		}
		String a = args[0];
		// verifier l'extension .mcs
		int pt = a.lastIndexOf('.');
		if (pt != -1) {
			String ext = a.substring(pt + 1);
			if (!"mcs".equals(ext))
				throw new MCSException(Messages.getString("MCS.extError"));
			else {
			}
		} else
			throw new MCSException(Messages.getString("MCS.extError"));
	}

	public static void main(String[] args) {
		try {
			// Il faut au moins le nom du fichier source.
			checkFile(args);
			// Creer le source
			ISourceUnit cu = new MCSSourceFile(args);
			// Gestion des erreurs
			ProblemReporter prp = new ProblemReporter(cu);
			ProblemRequestor prq = new ProblemRequestor();
			System.err.println("Compiling " + cu.getFileName());
			// lancer la compilation.
			MCS compilo = new MCS(prp);
			prq.beginReporting();
			compilo.set_source((MCSSourceFile) cu);
			compilo.set_eval(true);
			compilo.compile(cu);
			// Traiter les erreurs
			for (IProblem problem : prp.getAllProblems())
				prq.acceptProblem(problem);
			prq.endReporting();
			//			if (prp.getAllProblems().size() != 0) {
//				System.err.println(Messages.getString("MCS.ok"));
//			} else {
//				System.err.println(Messages.getString("MCS.ko"));
//
//			}
			System.exit(0);
		} catch (MCSException e) {
			// Erreurs internes
			System.err.println(e.getMessage());
			System.exit(1);
		} catch (Exception e) {
			// Autres erreurs
			e.printStackTrace();
			System.exit(2);
		}
	}
}
