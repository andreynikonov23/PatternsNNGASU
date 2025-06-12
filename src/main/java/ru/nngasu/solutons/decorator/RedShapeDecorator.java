package ru.nngasu.solutons.decorator;


public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public javafx.scene.shape.Shape draw() {
        javafx.scene.shape.Shape shape = decoratedShape.draw();
        shape.setStyle(setRedBorder());
        return shape;
    }

    public String setRedBorder() {
        return "-fx-stroke: red; -fx-stroke-width: 2;";
    }
}
