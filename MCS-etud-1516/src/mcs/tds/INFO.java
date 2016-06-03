//--------------------------------------------------
// INFO la classe representant une info de TDS
//--------------------------------------------------
package mcs.tds;
import mcs.type.*;

public class INFO {

	protected DTYPE type;
	protected String acces;
	
	public INFO(DTYPE t) {
		type = t;
		acces = "def";
	}

	public DTYPE getType() { return type; }
	
	public String getAcces() { return acces; }
	
	public void setAcces(String acces) { this.acces = acces; }

	public String toString() {
		return "; INFO : " + "type=" + type;
	}
}
