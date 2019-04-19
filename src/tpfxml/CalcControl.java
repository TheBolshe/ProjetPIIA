package tpfxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class CalcControl {
	
	protected CalcModel model;
	@FXML private TextField textField;
	
	public CalcControl(){
		this.model = new CalcModel();
	}
	
	@FXML
	protected void addDigit(ActionEvent e) {
		Button button= (Button)e.getSource();
		String buttonName = button.getText();
		long d = Long.valueOf(buttonName);
		model.addDigitRight(d);
		textField.setText(Long.toString(model.nb));
	}

	@FXML
	protected void addOperator(ActionEvent e) {
		Button button= (Button)e.getSource();
		String buttonName = button.getText();
		model.addOperator(buttonName);
	}
	
	@FXML
	protected void calculate(ActionEvent e) {
		model.calculate();
		textField.setText(Long.toString(model.nb));
	}
	
	@FXML
	protected void clear(ActionEvent e) {
		textField.setText("");
		model.clear();
	}
	
}