package tpfxml;

import java.awt.Button;
import java.awt.Event;
import java.util.Observable;
import java.util.Observer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class ExempleControl implements Observer {
	//j'ai recuperé les boutons grace a leurs id 
	//quand on ecrit les foction on les mettre dans le onAction de chaque bouton slon la methode qui lui correspond
	@FXML
	private Canvas canvas;
	private ToggleButton pen;
	private ToggleButton gomme;
	private ToggleButton shapes;
	private ToggleButton potPeinture;
	private ToggleButton fontColor;
	private ToggleButton insertImage;
	private ToggleButton selection;
	private ToggleButton move;
	private ToggleButton loop;
	private ToggleButton pinceau;
	private Button newFolder;
	private Button Folder;
	private Button save;
	private Button selectionner;
	private Button exporter;
	private ChoiceBox typeFichier;
	private GraphicsContext gc;
	
	
	private ColorPicker cpLine = new ColorPicker(Color.BLACK);
    private ColorPicker cpFill = new ColorPicker(Color.TRANSPARENT);
    



	@Override
	public void update(Observable o, Object arg) {
	this.draw();
	}
	void draw(Event e) {
		   gc.setStroke(cpLine.getValue());
           gc.beginPath();
           gc.lineTo(e.getX(), e.getY());
		 
	
	}
	//ce qui s'affiche sur le canvas 
		@FXML
		public void initialize() {
			GraphicsContext gc = canvas.getGraphicsContext2D();
			gc.setFill(Color.BLUE);
			gc.fillRect(0,  0, 540, 395);
		}
}
