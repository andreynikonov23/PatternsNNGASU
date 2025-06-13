package ru.nngasu.solutons.strategy;

public class Context {
    public Context() {
    }

    public double calculate(int aX, int aY, int bX, int bY, int cX, int cY) {
        Strategy strategy = new TriangleAreaFromVertices(aX, aY, bX, bY, cX, cY);
        return strategy.calculate();
    }

    public double calculate(double a, double b, double c) {
        Strategy strategy = new TriangleHeronArea(a, b, c);
        return strategy.calculate();
    }

    public double calculate(double base, double height) {
        Strategy strategy = new TriangleBaseHeightArea(base, height);
        return strategy.calculate();
    }
}
