package mcs.tds;

import mcs.type.DTYPE;

public class INFOINTERFACE extends INFO {

	protected TDS tdsContenu;

	public INFOINTERFACE(DTYPE t, TDS tds) {
		super(t);	
		tdsContenu = tds;
	}

	public TDS getContenu() { return tdsContenu; }

	public String toString() {
		return "INFOINTERFACE : contenu => " + tdsContenu;
	}

}
