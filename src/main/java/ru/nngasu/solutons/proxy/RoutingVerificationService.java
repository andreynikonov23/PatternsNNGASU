package ru.nngasu.solutons.proxy;

public class RoutingVerificationService implements Verifiable{
    private final String RIGHT_CODE = "3674";
    @Override
    public boolean verify(String code) {
        if (code.equals(RIGHT_CODE))
            return true;
        return false;
    }
}
