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
	

	public String toString() {
		return "; INFO : " + "type=" + type;
	}
}
