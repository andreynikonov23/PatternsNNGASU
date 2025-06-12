package ru.nngasu.solutons.factory;

import java.util.HashMap;
import java.util.Random;

public class DoughnutFabric {
    private final DoughnutType[] TYPES = DoughnutType.values();
    private final HashMap<DoughnutType, Integer> generatedTypesCount = new HashMap<>();
    private Doughnut[] randomDoughnuts = new Doughnut[100];

    public DoughnutFabric() {
        try {
            generateHundredDoughnuts();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Doughnut getDoughnut(DoughnutType type) throws IllegalAccessException {
        Doughnut toReturn = null;
        switch (type) {
            case ALMOND -> toReturn = new AlmondDoughnut();
            case CHERRY -> toReturn = new CherryDoughnut();
            case CHOCOLATE -> toReturn = new ChocolateDoughnut();
            default -> throw new IllegalAccessException("Wrong doughnut type: " + type);
        }
        return toReturn;
    }
    public String eatRandomDoughnut() {
        Random random = new Random();
        Doughnut eatingDoughnut = randomDoughnuts[random.nextInt(randomDoughnuts.length)];
        return eatingDoughnut.eat() + "With the address - " + eatingDoughnut;
    }

    public Doughnut[] getRandomDoughnuts() {
        return randomDoughnuts;
    }

    public HashMap<DoughnutType, Integer> getGeneratedTypesCount() {
        return generatedTypesCount;
    }

    private void generateHundredDoughnuts() throws IllegalAccessException {
        Random random = new Random();

        for (int i = 0; i < randomDoughnuts.length; i++) {
            DoughnutType randomType = TYPES[random.nextInt(TYPES.length)];
            System.out.println(randomType);
            randomDoughnuts[i] = getDoughnut(randomType);
            count(randomType);
        }
    }

    private void count(DoughnutType type) {
        if (generatedTypesCount.containsKey(type)) {
            int count = generatedTypesCount.get(type) + 1;
            generatedTypesCount.put(type, count);
        } else
            generatedTypesCount.put(type, 1);
    }
}
