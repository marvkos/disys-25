package at.technikum.uiapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    private int counter = 0;

    @FXML
    private Label welcomeText;

    @FXML
    private TextField numberA;

    @FXML
    private TextField numberB;

    @FXML
    protected void onHelloButtonClick() {
        int a = Integer.parseInt(numberA.getText());
        int b = Integer.parseInt(numberB.getText());

        counter++;
        welcomeText.setText(String.format("%d + %d = %d", a, b, a + b));
        // nameInput.setText("");
    }
}
