package ru.nngasu.solutons.strategy;

public class TriangleHeronArea implements Strategy{
    private double a;
    private double b;
    private double c;

    public TriangleHeronArea() {}

    public TriangleHeronArea(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculate() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
}
