package tpfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ExempleView extends Application {
	//on fait appel aux methode ici apres 

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Application Dessin");
		BorderPane myPane = (BorderPane)FXMLLoader.load(getClass().getResource("appliDessin.fxml"));
		Scene myScene = new Scene(myPane, 1000, 500);
		primaryStage.setScene(myScene);
		primaryStage.show();
		

	}

	public static void main(String[] args) {
		launch(args);
	}
	
}


