package ru.nngasu.solutons.decorator;

import javafx.scene.paint.Color;

public class Rectangle implements Shape{
    private final javafx.scene.shape.Rectangle rectangle;

    public Rectangle() {
        rectangle = new javafx.scene.shape.Rectangle(300, 200, Color.LIGHTBLUE);
    }
    @Override
    public javafx.scene.shape.Shape draw() {
        rectangle.setLayoutX(200);
        rectangle.setLayoutY(100);
        return rectangle;
    }
}
