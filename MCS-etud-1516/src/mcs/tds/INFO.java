//--------------------------------------------------
// INFO la classe representant une info de TDS
//--------------------------------------------------
package mcs.tds;
import mcs.type.*;

public class INFO {

	protected DTYPE type;
	
	public INFO(DTYPE t) {
		type = t;
	}

	public DTYPE getType() { return type; }
	
	/*
	 * utilisée pour le cast uniquement à priori
	 */
	public void setType(DTYPE type) { this.type = type; }
	

	public String toString() {
		return "; INFO : " + "type=" + type;
	}
}
