package mvc;

import javafx.scene.canvas.GraphicsContext;

public class MDisque extends Forme {

	private double rayon;
	
	MDisque(double x, double y, double rayon) {
		super(x,y);
		this.rayon=rayon;
	}
	
	double getRayon() {return this.rayon;}
	void setRayon(double rayon) {this.rayon=rayon;}
	
	boolean estDedans(double x, double y) {
		double xc=this.x+this.rayon;
		double yc=this.y+this.rayon;
		return (x-xc)*(x-xc) + (y-yc)*(y-yc) < this.rayon*this.rayon;
	}
	
	void draw(GraphicsContext gc) {
		gc.fillOval(this.x, this.y, 2*this.rayon, 2*this.rayon);
	}
	
}
