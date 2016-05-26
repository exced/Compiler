package mcs.tds;
import mcs.type.*;


public class INFOPARAM extends INFO {

	private String code;
	
	public INFOPARAM(DTYPE t, String c) {
		super(t);
		code = c;
	}
	
	public String getCode(){ return code; }
	
	public String toString() {
		return "; INFOPARAM : " + "type=" + type.getNom();
	}
	
}