package mvc;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Control {
	
	private GraphicsContext gc; //pour le Canvas de la vue
	private double cWidth, cHeight;//Hauteur, largeur du Canvas
	private Modele model;
	
	private int formeIdx;
	private boolean enDeplacement=false;
	
	Control(GraphicsContext gsc, double cWidth, double cHeight) {
		this.gc=gc;
		this.cWidth = cHeight;
		this.cHeight = cHeight;
		model = new Modele();
		init();
	}
	
	void init() {
		model.add(new MRectangle(50,50,50,30));
		model.add(new MDisque(100,100,50));
		model.add(new MDisque(300,200,80));
	}
	
	void draw() {
		gc.setFill(Color.WHITE);
		gc.fillRect(0,0,this.cWidth,this.cHeight);
		gc.setFill(Color.BLACK);
		for (int i=0; i<model.getSize();i++) {
			Forme f=model.get(i);
			f.draw(gc);
		}
	}
	
	void attrape(MouseEvent e) {
		for (int i=0; i<model.getSize();i++) {
			Forme f=model.get(i);
			if (f.estDedans(e.getX(), e.getY())) {
				formeIdx=i;
				enDeplacement=true;
				break;
			}
		}
	}

	void deplace(MouseEvent e) {
		if (enDeplacement) {
			model.get(formeIdx).setX(e.getX());
			model.get(formeIdx).setY(e.getY());
			this.draw();
		}
	}
	
	void lache(MouseEvent e) {
		enDeplacement=false;
	}
}
