package ru.nngasu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/main.fxml"));
        stage.setTitle("Архитектура ПО");
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }
}