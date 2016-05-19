package mcs.tds;
import mcs.type.*;

public class INFOFONC extends INFO {

	// La TDS des paramètres
	protected TDS tdsParam;
	
	public INFOFONC(DTYPE t, TDS tds){
		// Le type de la fonction est son type de retour
		super(t);
		this.tdsParam = tds;
	}
	
	// Affichage
	public String toString() {
		return "INFOFONC : fonction => " + type.getNom();
	}
	
	// Obtenir la tds des paramètres de la fonction
	public TDS getParams(){
		return this.tdsParam;
	}

}
