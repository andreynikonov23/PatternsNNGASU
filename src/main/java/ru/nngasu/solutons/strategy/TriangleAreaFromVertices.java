package ru.nngasu.solutons.strategy;

public class TriangleAreaFromVertices implements Strategy{
    private int aX;
    private int aY;
    private int bX;
    private int bY;
    private int cX;
    private int cY;

    public TriangleAreaFromVertices() {}

    public TriangleAreaFromVertices(int aX, int aY, int bX, int bY, int cX, int cY) {
        this.aX = aX;
        this.aY = aY;
        this.bX = bX;
        this.bY = bY;
        this.cX = cX;
        this.cY = cY;
    }

    @Override
    public double calculate() {
        return 0.5 * Math.abs((bX - aX) * (cY - aY) - (cX - aX) * (bY - aY));
    }
}
