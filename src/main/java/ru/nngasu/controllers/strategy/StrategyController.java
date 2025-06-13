package ru.nngasu.controllers.strategy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import ru.nngasu.solutons.strategy.Context;

import java.text.DecimalFormat;

public class StrategyController {

    @FXML
    private TextField baseField;

    @FXML
    private Text errorMessage;

    @FXML
    private TextField heightField;

    @FXML
    private Text resultTriangleBaseHeightArea;

    @FXML
    private Text resultTriangleHeronArea;

    @FXML
    private Text resultTriangleAreaFromVertices;

    @FXML
    private TextField sideAField;

    @FXML
    private TextField sideBField;

    @FXML
    private TextField sideCField;

    @FXML
    private TextField x1Field;

    @FXML
    private TextField x2Field;

    @FXML
    private TextField x3Field;

    @FXML
    private TextField y1Field;

    @FXML
    private TextField y2Field;

    @FXML
    private TextField y3Field;

    @FXML
    void calculateTriangleAreaFromVertices(ActionEvent event) {
        int aX, aY, bX, bY, cX, cY;
        try {
            aX = Integer.parseInt(x1Field.getText());
            aY = Integer.parseInt(y1Field.getText());
            bX = Integer.parseInt(x2Field.getText());
            bY = Integer.parseInt(y1Field.getText());
            cX = Integer.parseInt(x3Field.getText());
            cY = Integer.parseInt(y3Field.getText());
        } catch (Exception e) {
            displayError("The data in the fields \"Calculate by vertex coordinates\" is invalid");
            return;
        }
        Context context = new Context();
        double result = context.calculate(aX, aY, bX, bY, cX, cY);
        resultTriangleAreaFromVertices.setText(new DecimalFormat("#.##").format(result));
        resultTriangleAreaFromVertices.setVisible(true);
    }

    @FXML
    void calculateTriangleBaseHeightArea(ActionEvent event) {
        double base, height;
        try {
            base = Double.parseDouble(baseField.getText());
            height = Double.parseDouble(heightField.getText());
        } catch (Exception e) {
            displayError("The data in the fields \"Calculate by half the product of the base and height\" is invalid");
            return;
        }
        Context context = new Context();
        double result = context.calculate(base, height);
        resultTriangleBaseHeightArea.setText(new DecimalFormat("#.##").format(result));
        resultTriangleBaseHeightArea.setVisible(true);
    }

    @FXML
    void calculateTriangleHeronArea(ActionEvent event) {
        double a, b, c;
        try {
            a = Double.parseDouble(sideAField.getText());
            b = Double.parseDouble(sideBField.getText());
            c = Double.parseDouble(sideCField.getText());
        } catch (Exception e) {
            displayError("The data in the fields \"Calculate using Heron's formula\" is invalid");
            return;
        }
        Context context = new Context();
        double result = context.calculate(a, b, c);
        resultTriangleHeronArea.setText(new DecimalFormat("#.##").format(result));
        resultTriangleHeronArea.setVisible(true);
    }

    private void displayError(String message) {
        errorMessage.setText(message);
        errorMessage.setVisible(true);
        clearTextFields();
    }

    private void clearTextFields() {
        x1Field.clear();
        y1Field.clear();
        x2Field.clear();
        y2Field.clear();
        x3Field.clear();
        y3Field.clear();
        sideAField.clear();
        sideBField.clear();
        sideCField.clear();
        baseField.clear();
        heightField.clear();
        resultTriangleAreaFromVertices.setVisible(false);
        resultTriangleHeronArea.setVisible(false);
        resultTriangleBaseHeightArea.setVisible(false);
    }

}
