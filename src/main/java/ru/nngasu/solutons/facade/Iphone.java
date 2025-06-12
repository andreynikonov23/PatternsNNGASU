package ru.nngasu.solutons.facade;

public class Iphone implements MobileShop{
    @Override
    public String modelNo() {
        return "Iphone model No";
    }

    @Override
    public String price() {
        return "Iphone price";
    }
}
