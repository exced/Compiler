package mcs.type;

public interface DTYPE {
	/**
	 * La taille du type de donnee : depend de la machine
	 * @return
	 */
	public int getTaille();

	/** Le nom pour un affichage plus convivial
	 * @return
	 */
	public String getNom();

	/**
	 * Fonction de compatibilité avec l'autre type
	 * @param autre
	 * @return
	 */
	public boolean compareTo(DTYPE autre);
	
	public boolean compareOpUn(DTYPE op);
	
	public boolean compareOpBin(DTYPE op, DTYPE b);
	
	public boolean isCastableAs(DTYPE t);

	public String toString();
}
