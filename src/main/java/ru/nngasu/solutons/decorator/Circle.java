package ru.nngasu.solutons.decorator;

import javafx.scene.paint.Color;

import java.awt.*;

public class Circle implements Shape{
    private final javafx.scene.shape.Circle circle;

    public Circle() {
        circle = new javafx.scene.shape.Circle(100, Color.LIGHTBLUE);
    }

    @Override
    public javafx.scene.shape.Shape draw() {
        circle.setLayoutX(200);
        circle.setLayoutY(100);
        return circle;
    }
}
