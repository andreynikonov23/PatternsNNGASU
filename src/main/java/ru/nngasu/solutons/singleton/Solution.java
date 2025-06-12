package ru.nngasu.solutons.singleton;

public class Solution {
    private static Animal animal;

    static {
        readInitedAnimal("CAT");
    }

    private static Animal readInitedAnimal(String name) {
        if (animal == null) {
            switch (name) {
                case "CAT" -> animal = new Cat();
                case "DOG" -> animal = new Dog();
                case "RAT" -> animal = new Rat();
                default -> throw new IllegalArgumentException();
            }
        }
        return animal;
    }

    public static String getMessage() {
        if (animal != null) {
            return animal.getName();
        }
        return "";
    }
}
