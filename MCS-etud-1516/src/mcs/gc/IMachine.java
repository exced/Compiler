package mcs.gc;

import mcs.compiler.MCSException;

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

}