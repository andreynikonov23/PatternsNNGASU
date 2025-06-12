package ru.nngasu.controllers.facade;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import ru.nngasu.solutons.facade.ShopKeeper;

public class FacadeController {
    private ShopKeeper shopKeeper;

    @FXML
    private TextArea outputArea;

    @FXML
    private Button samsungButton;

    @FXML
    void initialize() {
        shopKeeper = new ShopKeeper();
    }

    @FXML
    void blackberrySale(ActionEvent event) {
        outputArea.setText(shopKeeper.blackberrySale());
    }

    @FXML
    void iphoneSale(ActionEvent event) {
        outputArea.setText(shopKeeper.iphoneSale());
    }

    @FXML
    void samsungSale(ActionEvent event) {
        outputArea.setText(shopKeeper.samsungSale());
    }

}
