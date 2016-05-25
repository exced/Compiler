package mcs.gc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import mcs.compiler.MCSException;
import mcs.tds.*;

/**
 * Cette interface décrit une machine cible. A compléter, selon votre modèle
 * 
 * @author marcel
 * 
 */
public interface IMachine {
	/**
	 * Suffixe du fichier cible (.tam par exemple)
	 * 
	 * @return
	 */
	String getSuffixe();

	/**
	 * Ecrit le code dans un fichier à partir du nom du fichier source et du
	 * suffixe
	 * 
	 * @param fileName
	 * @param code
	 * @throws MCSException
	 */

	void writeCode(String fileName, String code) throws MCSException;
	
	public Register getSB();
	
	public Register getLB();
	
	public Register getST();
	
	public void saveLB(Register newLB);
	
	public void restoreLB();
	
	public int getCurrentDep();

	public void addCurrentDep(int dep);
	
	public void resetCurrentDep();
	
	public void addRegisterDep(Register r, int d);
	
	public String genChaine(String s);
	
	public String genChar(String s);

	public String genFonction(String etiquette, int taillepars,int tailleretour, String code);
	
	public String genArgs(TDS t);

	public String genCall(String etiquette);

	public String genDecl(String n, INFOVAR i, String t);

	public String genEtiq();

	public String genFin();

	public void genAsm(String nomf, String code);

	public String genVar(int taille);
	
	public String genCst(String v);

	public String genFree();

	public String genReadMem(int dep, int taille);

	public String genWriteMem(int dep, int taille);

	public String genReadIndirectMem(int taille);

	public String genWriteIndirectMem(int taille);

	public String genIf(String code, String code2, String code3);

	public String genMalloc(int taille);

	public String genAdr(int dep);

	public String genAdrField(int dep);

	public String genComment(String c);
	
	public String genOp(String op);

}