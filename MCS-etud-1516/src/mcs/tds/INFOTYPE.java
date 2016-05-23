package mcs.tds;
import mcs.type.*;


public class INFOTYPE extends INFO {

	public INFOTYPE(DTYPE t) {
		super(t);
	}
	
	public String toString() {
		return "; INFOTYPE alias sur : " + "type=" + type.getNom() ;
	}
	
}