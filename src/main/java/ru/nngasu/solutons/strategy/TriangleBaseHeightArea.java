package ru.nngasu.solutons.strategy;

public class TriangleBaseHeightArea implements Strategy{
    private double base;
    private double height;

    private TriangleBaseHeightArea() {}

    public TriangleBaseHeightArea(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculate() {
        return 0.5 * base * height;
    }
}
