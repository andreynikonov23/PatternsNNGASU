package ru.nngasu.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    void openAbstractFactory(MouseEvent event) { show("/view/absfactory/absfactory.fxml"); }

    @FXML
    void openDecorator(MouseEvent event) {
        show("/view/decorator/menu.fxml");
    }

    @FXML
    void openFactory(MouseEvent event) { show("/view/factory/factory.fxml"); }

    @FXML
    void openFacade(MouseEvent event) { show("/view/facade/facade.fxml");}

    @FXML
    void openProxy(MouseEvent event) { show("/view/proxy/proxy.fxml");}

    @FXML
    void openSingleton(MouseEvent event) { show("/view/singleton/singleton.fxml");}

    @FXML
    void openStrategy(MouseEvent event) {}

    private void show(String solutionFile) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(solutionFile));

        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
