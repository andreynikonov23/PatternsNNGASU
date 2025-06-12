package ru.nngasu.controllers.singleton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import ru.nngasu.solutons.singleton.Solution;

public class SingletonController {

    @FXML
    private TextField textField;

    @FXML
    void initAnimal(ActionEvent event) {
        textField.setText(Solution.getMessage());
    }

}
