package ru.nngasu.solutons.facade;

public class ShopKeeper {
    private Iphone iphone;
    private Samsung samsung;
    private Blackberry blackberry;

    public ShopKeeper() {
        iphone = new Iphone();
        samsung = new Samsung();
        blackberry = new Blackberry();
    }

    public String iphoneSale() {
        return iphone.modelNo() + "--" + iphone.price();
    }

    public String samsungSale() {
        return samsung.modelNo() + "--" + samsung.price();
    }

    public String blackberrySale() {
        return blackberry.modelNo() + "--" + blackberry.price();
    }
}
