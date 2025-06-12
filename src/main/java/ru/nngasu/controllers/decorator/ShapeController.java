package ru.nngasu.controllers.decorator;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import ru.nngasu.solutons.decorator.Shape;

public class ShapeController {
    @FXML
    private AnchorPane anchorPane;

    public void setShape(Shape shape) {
        anchorPane.getChildren().add(shape.draw());
    }
}
