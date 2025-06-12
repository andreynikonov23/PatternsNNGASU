package ru.nngasu.controllers.factory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import ru.nngasu.solutons.factory.Doughnut;
import ru.nngasu.solutons.factory.DoughnutFabric;
import ru.nngasu.solutons.factory.DoughnutType;

import java.util.Map;

public class FactoryController {
    private DoughnutFabric doughnutFabric;

    @FXML
    private Text eatingDoughnutMessage;

    @FXML
    private Text generatedTtpesCountMessage;

    @FXML
    public void initialize() {
        doughnutFabric = new DoughnutFabric();
    }

    @FXML
    void eatAlmondDoughnut(ActionEvent event) {
        activateEatDoughnutMessage(DoughnutType.ALMOND);
    }

    @FXML
    void eatCherryDoughnut(ActionEvent event) {
        activateEatDoughnutMessage(DoughnutType.CHERRY);
    }

    @FXML
    void eatChocolateDoughnut(ActionEvent event) {
        activateEatDoughnutMessage(DoughnutType.CHOCOLATE);
    }

    @FXML
    void eatRandomDoughnut(ActionEvent event) {
        String message = doughnutFabric.eatRandomDoughnut();
        StringBuilder typesCountMessage = new StringBuilder();

        for(Map.Entry<DoughnutType, Integer> entry : doughnutFabric.getGeneratedTypesCount().entrySet()) {
            typesCountMessage.append(entry.getKey() + " - " + entry.getValue() + "\n");
        }

        eatingDoughnutMessage.setText(message);
        eatingDoughnutMessage.setVisible(true);
        generatedTtpesCountMessage.setText(typesCountMessage.toString());
        generatedTtpesCountMessage.setVisible(true);
    }

    private void activateEatDoughnutMessage(DoughnutType type) {
        Doughnut doughnut = null;
        try {
            doughnut = doughnutFabric.getDoughnut(type);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        eatingDoughnutMessage.setText(doughnut.eat());
        eatingDoughnutMessage.setVisible(true);
    }

}
