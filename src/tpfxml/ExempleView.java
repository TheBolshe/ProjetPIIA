package tpfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExempleView extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Exemple FXML");
		GridPane myPane = (GridPane)FXMLLoader.load(getClass().getResource("exemple.fxml"));
		Scene myScene = new Scene(myPane, 100, 100);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}


