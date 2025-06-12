package ru.nngasu.solutons.absfactory;

public class RuCarPriceAbsFactory implements InteAbsFactory{
    @Override
    public Lada getLada() {
        return new RuLadaImpl();
    }

    @Override
    public Ferrari getFerrari() {
        return new RuFerrariImpl();
    }

    @Override
    public Porsche getPorsche() {
        return new RuPorscheImpl();
    }
}
