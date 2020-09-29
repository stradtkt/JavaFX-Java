package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    public void initialized() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }
    @FXML
    public void onButtonClicked(ActionEvent event) {
        if(event.getSource().equals(helloButton)) {
            System.out.println("Hello, " + nameField.getText());
        } else if(event.getSource().equals(byeButton)) {
            System.out.println("Bye, " + nameField.getText());
        }
    }
    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disabledButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disabledButtons);
        byeButton.setDisable(disabledButtons);
    }
}
