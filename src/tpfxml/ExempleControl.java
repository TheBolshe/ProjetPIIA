package tpfxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ExempleControl {
	
	@FXML private Label labelHello;
	
	@FXML
	protected void sayHello(ActionEvent e) {
		System.out.println(labelHello.getText());
	}
}
