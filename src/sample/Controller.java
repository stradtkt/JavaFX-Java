package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox checkBox;
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
        if(checkBox.isSelected()) {
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }
    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disabledButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disabledButtons);
        byeButton.setDisable(disabledButtons);
    }
    @FXML
    public void handleChange() {
        System.out.println("The checkbox is " + (checkBox.isSelected() ? "checked" : "not checked"));
    }
}
