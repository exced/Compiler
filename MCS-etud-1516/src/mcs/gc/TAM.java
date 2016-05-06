package mcs.gc;

import mcs.tds.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TAM extends AbstractMachine{
	private String nom;

	public TAM(String fname) {
		if (fname.endsWith(".mcs")) {
			nom = fname.substring(0, fname.length() - 5);
		} else {
			nom = fname;
		}
	}

	public String genFonction(String etiquette, int taillepars,
			int tailleretour, String code) {
		return "_" + etiquette + ":\n" + code + "\tRETURN (" + taillepars + ") "
				+ tailleretour + "\n";

	}

	public String genCall(String etiquette) {
		return "; Appel a " + etiquette + "\n" + "\tCALL(SB) _" + etiquette
				+ "\n";
	}

	// genere le code pour une declaration (avec initialisation)
	public String genDecl(String n, INFOVAR i, String t) {
		int taille = i.getType().getTaille();
		return "   ; declaration de " + n + " en " + i.getEmpl().getDep() + "/LB"
				+ " taille = " + taille + "\n" + t + "; fin de declaration de "
				+ n + "\n";
	}

	// compteur pour le generateur d'etiquettes
	private static int cpt = 0;

	// genere une etiquette differente des autres
	public String genEtiq() {
		return "X" + cpt++;
	}

	// genere le code pour l'arret de la machine
	public String genFin() {
		return "\tHALT\n";
	}

	public void genAsm(String nomf, String code) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(nom + ".tam"));
			pw.println(";;; code TAM engendre pour " + nom + "\n");
			pw.print(genCall(nomf));
			pw.print(genFin());
			pw.print(code);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String genCst(String v) {
		return "\tLOADL " + v + "\n";
	}

	public String genFree(int i) {
		// TODO Auto-generated method stub
		return "\tPOP(0)" + i + "\n";
	}

	public String genReadMem(int dep, int taille) {
		// TODO Auto-generated method stub
		return "\tLOAD(" + taille + ") " + dep + "[LB]\n";
	}

	public String genWriteMem(int dep, int taille) {
		// TODO Auto-generated method stub
		return "\tSTORE(" + taille + ") " + dep + "[LB]\n";
	}

	public String genReadIndirectMem(int taille) {
		// TODO Auto-generated method stub
		return "\tLOADI(" + taille + ")\n";
	}

	public String genWriteIndirectMem(int taille) {
		// TODO Auto-generated method stub
		return "\tSTOREI(" + taille + ")\n";
	}

	public String genIf(String code, String code2, String code3) {
		String sinon = genEtiq();
		String fin = genEtiq();
		return "\t; if\n" + code + "\n" + "\tJUMPIF(0) " + sinon + "\n" + code2
				+ "\n" + "\tJUMP " + fin + "\n" + sinon + "\n" + code3 + "\n"
				+ fin + "\n" + "\t; fin if\n";
	}

	public String genMalloc(int taille) {
		return "\tLOADL " + taille + "\n" + "\tSUBR Malloc\n";
	}

	public String genAdr(int dep) {
		return "\tLOADA " + dep + "[LB]\n";
	}

	public String genAdrField(int dep) {
		return "\t;Calcul deplacement struct " + dep + "\n" + "\tLOADL " + dep
				+ "\n\tSUBR Iadd\n";
	}

	public String genComment(String c) {
		return "; " + c + "\n";
	}

	@Override
	public String getSuffixe() {
		return "tam";
	}
}
