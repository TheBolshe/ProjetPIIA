package mvc;

import java.util.Vector;

public class Modele {
	
	private Vector<Forme> tab;
	
	Modele(){
		tab = new Vector<Forme>();
	}
	
	Forme get(int i) {return tab.get(i);}
	
	int getSize() {return tab.size();}
	
	void add(Forme f) {tab.add(f);}

}
