package tpfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalcView extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Exemple FXML");
		GridPane myPane = (GridPane)FXMLLoader.load(getClass().getResource("calc.fxml"));
		Scene myScene = new Scene(myPane, 200, 220);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
