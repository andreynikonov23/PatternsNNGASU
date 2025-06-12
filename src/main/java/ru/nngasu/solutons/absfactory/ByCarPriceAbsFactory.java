package ru.nngasu.solutons.absfactory;

public class ByCarPriceAbsFactory implements InteAbsFactory {
    @Override
    public Lada getLada() {
        return new ByLadaImpl();
    }

    @Override
    public Ferrari getFerrari() {
        return new ByFerrariImpl();
    }

    @Override
    public Porsche getPorsche() {
        return new ByPorscheImpl();
    }
}
