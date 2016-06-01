package mcs.type;

import java.util.ArrayList;


public class LCHAMPS extends ArrayList<CHAMP> {
	
	private int currentDep = 0;

	private static final long serialVersionUID = 1L;
	
	public int getCurrentDep(){
		return currentDep;
	}
	
	public CHAMP chercherChamp(String nom){
		CHAMP c = null;
		for(CHAMP ch : this){
			if(ch.getNom().equals(nom)){
				c = ch;
				break;
			}
		}
		return c;
	}

	public void inserer(CHAMP c) {
		currentDep += c.getType().getTaille();
		c.setDep(currentDep);
		add(c);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (CHAMP c : this) {
			sb.append(c + ", ");
		}
		return sb.toString();
	}

	public boolean compareTo(LCHAMPS autre) {
		int lc = size();
		int lca = autre.size();
		if (lc != lca)
			return false;
		for (int i = 0; i < lc; i++) {
			CHAMP c = get(i);
			CHAMP ca = autre.get(i);
			if (!c.getNom().equals(ca.getNom())
					|| !c.getType().compareTo(ca.getType()))
				return false;
		}
		return true;
	}
}
