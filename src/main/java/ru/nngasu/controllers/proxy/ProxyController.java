package ru.nngasu.controllers.proxy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import ru.nngasu.solutons.proxy.CardVerificationService;
import ru.nngasu.solutons.proxy.RoutingVerificationService;

public class ProxyController {
    private boolean doorIsOpen;
    private RoutingVerificationService routingVerificationService;
    private CardVerificationService cardVerificationService;

    @FXML
    private ImageView card;

    @FXML
    private Text message;

    @FXML
    private TextField viewer;

    @FXML
    private void initialize() {
        doorIsOpen = false;
        routingVerificationService = new RoutingVerificationService();
        cardVerificationService = new CardVerificationService();
        Image image = new Image("/images/credit-card.png");
        card.setImage(image);
    }

    @FXML
    void Enter(ActionEvent event) {
        if (!(doorIsOpen)) {
            String code = viewer.getText();
            if (routingVerificationService.verify(code)) {
                openDoor();
            } else {
                message.setText("Incorrect code!");
                message.setVisible(true);
            }
        }
    }

    @FXML
    void clear(ActionEvent event) {
        viewer.clear();
    }

    @FXML
    void close(ActionEvent event) {
        if (doorIsOpen) {
            doorIsOpen = false;
            message.setText("Door is closed");
            message.setVisible(true);
        }
    }

    @FXML
    void selectEight(ActionEvent event) {
        setText("8");
    }

    @FXML
    void selectFive(ActionEvent event) {
        setText("5");
    }

    @FXML
    void selectFour(ActionEvent event) {
        setText("4");
    }

    @FXML
    void selectNine(ActionEvent event) {
        setText("9");
    }

    @FXML
    void selectOne(ActionEvent event) {
        setText("1");
    }

    @FXML
    void selectSeven(ActionEvent event) {
        setText("7");
    }

    @FXML
    void selectSix(ActionEvent event) {
        setText("6");
    }

    @FXML
    void selectThree(ActionEvent event) {
        setText("3");
    }

    @FXML
    void selectTwo(ActionEvent event) {
        setText("2");
    }

    @FXML
    void verifyByCard(MouseEvent event) {
        if (!(doorIsOpen)) {
            if (cardVerificationService.verify("")) {
                openDoor();
            } else {
                message.setText("Incorrect code");
                message.setVisible(true);
            }
        }
    }

    private void openDoor() {
        doorIsOpen = true;
        message.setText("Door is open");
        message.setVisible(true);
    }

    private void setText(String text) {
        if (viewer.getText().length() < 4) {
            String code = viewer.getText();
            viewer.clear();
            viewer.setText(code + text);
        }
    }

}
