package ru.nngasu.controllers.decorator;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import ru.nngasu.solutons.decorator.Circle;
import ru.nngasu.solutons.decorator.Rectangle;
import ru.nngasu.solutons.decorator.RedShapeDecorator;
import ru.nngasu.solutons.decorator.Shape;

import java.io.IOException;

public class MenuController {
    private Shape circle;
    private Shape rectangle;

    @FXML
    public void initialize() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    @FXML
    void openCircle(MouseEvent event) {
        show(circle);
    }

    @FXML
    void openCircleDecorator(MouseEvent event) {
        RedShapeDecorator decorator = new RedShapeDecorator(circle);
        show(decorator);
    }

    @FXML
    void openRectangle(MouseEvent event) {
        show(rectangle);
    }

    @FXML
    void openRectangleDecorator(MouseEvent event) {
        RedShapeDecorator decorator = new RedShapeDecorator(rectangle);
        show(decorator);
    }

    private void show(Shape shape) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/decorator/shape.fxml"));

        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ShapeController shapeController = loader.getController();
        shapeController.setShape(shape);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
