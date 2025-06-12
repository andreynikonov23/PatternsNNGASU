package ru.nngasu.solutons.proxy;

public class CardVerificationService implements Verifiable{
    private final String FIRMWARE = "3674";
    private RoutingVerificationService verificationService;

    @Override
    public boolean verify(String code) {
        if (verificationService == null) {
            verificationService = new RoutingVerificationService();
        }
        return verificationService.verify(FIRMWARE);
    }
}
