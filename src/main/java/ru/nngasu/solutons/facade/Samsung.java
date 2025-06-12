package ru.nngasu.solutons.facade;

public class Samsung implements MobileShop{
    @Override
    public String modelNo() {
        return "Samsung model No";
    }

    @Override
    public String price() {
        return "Samsung price";
    }
}
