package mcs.gc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import mcs.tds.INFO;
import mcs.tds.INFOVAR;
import mcs.tds.TDS;

/**
 * La machine TAM et ses fonctions de generation
 * @author marcel
 *
 */
public class MTAM extends AbstractMachine {
	
	private String nom;
	
	private Register SB;
	private Register LB;
	private Register ST;
	
	// compteur pour le generateur d'etiquettes
	private static int cpt = 0;
	
	// déplacement courant dans un bloc
	private int currentDep;

	public MTAM(String fname) {
		if (fname.endsWith(".mcs")) {
			nom = fname.substring(0, fname.length() - 5);
		} else {
			nom = fname;
		}
		currentDep = 0;
		SB = new Register("SB", 0);
		LB = new Register("LB", 0);
		ST = new Register("ST", 0);
	}
	
	public int getCurrentDep() { return currentDep; }
	
	public Register getSB() { return SB; }
	
	public Register getLB() { return LB; }
	
	public Register getST() { return ST; }

	public void addCurrentDep(int dep){
		currentDep += dep;
	}
	
	public void resetCurrentDep(){
		currentDep = 0;
	}	
	
	public void addRegisterDep(Register r, int d){
		r.depRegister(d);
	}
	
	public String genFonction(String etiquette, int taillepars,
			int tailleretour, String code) {
		return "_" + etiquette + ":\n" + code + "\tRETURN (" + taillepars + ") "
				+ tailleretour + "\n";

	}
	
	public String genArgs(TDS t){
		StringBuffer sb = new StringBuffer();
		Set<Map.Entry<String, INFO>> s = t.entrySet();
		for (Map.Entry<String, INFO> e : s) {  
			sb.append( e.getKey() );
		}
		return sb.toString();
	}

	public String genCall(String etiquette) {
		return "; Appel a " + etiquette + "\n" + "\tCALL(SB) _" + etiquette
				+ "\n";
	}

	// genere le code pour une declaration (avec initialisation)
	public String genDecl(String n, INFOVAR i, String t) {
		int taille = i.getType().getTaille();
		return "   ; declaration de " + n + " en " + i.getDep() + "/LB"
				+ " taille = " + taille + "\n" + t + "; fin de declaration de "
				+ n + "\n";
	}

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

	public String genVar(int taille){
		return "\tPUSH " + taille + "\n";
	}
	
	public String genCst(String v) {
		return "\tLOADL " + v + "\n";
	}
	
	public String genChar(String v) {
		return "\tLOADL " + v + "\n";
	}
	
	public String genChaine(String v) {
		return "\tLOADL " + v + "\n" + genOp("SAlloc");
	}

	public String genFree(){
		return "\tPOP (0) " + currentDep + "\n"; 
	}

	public String genReadMem(int dep, int taille) {
		return "\tLOAD(" + taille + ") " + dep + "[LB]\n";
	}

	public String genWriteMem(int dep, int taille) {
		return "\tSTORE(" + taille + ") " + dep + "[LB]\n";
	}

	public String genReadIndirectMem(int taille) {
		return "\tLOADI(" + taille + ")\n";
	}

	public String genWriteIndirectMem(int taille) {
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
	
	public String genOp(String op) {
		return "\tSUBR " + op + "\n";
	}

	@Override
	public String getSuffixe() {
		return "tam";
	}

}
