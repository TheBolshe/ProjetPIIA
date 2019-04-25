package mvc;

import javafx.scene.canvas.GraphicsContext;

abstract public class Forme {

	protected double x,y;
	
	Forme(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	double getX() {return x;}
	
	double getY() {return y;}
	
	void setX(double x) {this.x=x;}
	
	void setY(double y) {this.y=y;}
	
	abstract boolean estDedans(double x, double y);
	
	abstract void draw(GraphicsContext gc);
}
