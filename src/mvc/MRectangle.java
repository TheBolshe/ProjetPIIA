package mvc;

import javafx.scene.canvas.GraphicsContext;

public class MRectangle extends Forme {
	
	private double larg, haut;
	
	MRectangle(double x, double y, double larg, double haut) {
		super(x,y);
		this.larg=larg;
		this.haut=haut;
	}
	
	double getLargeur() {return larg;}
	double getHauteur() {return haut;}
	void setLargeur(double larg) {this.larg=larg;}
	void setHauetru(double haut) {this.haut=haut;}
	
	boolean estDedans(double x, double y) {
		return (x-this.x)<this.larg && (x-this.x)>0 && (y-this.y)<this.haut && (y-this.y)>0;
	}
	
	void draw(GraphicsContext gc) {
		gc.fillRect(this.x,this.y,this.larg,this.haut);
	}

}
