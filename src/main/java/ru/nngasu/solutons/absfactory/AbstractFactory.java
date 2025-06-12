package ru.nngasu.solutons.absfactory;

public class AbstractFactory {
    public static long getPrice(Currency currency, CarName carName) {
        InteAbsFactory ifactory = null;
        switch (currency) {
            case BY -> ifactory = new ByCarPriceAbsFactory();
            case RU -> ifactory = new RuCarPriceAbsFactory();
        }

        Car car = null;
        switch (carName) {
            case LADA -> car = ifactory.getLada();
            case FERRARI -> car = ifactory.getFerrari();
            case PORSCHE -> car = ifactory.getPorsche();
        }

        return car.getPrice();
    }
}
