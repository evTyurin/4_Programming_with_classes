package epam.learning.ex2_5;

public enum TypeOfTransport {
    BUS("bus", 30),
    TRAIN("train", 75),
    PLAIN("plain", 80),
    CAR("car", 50),
    SHIP("ship", 100);

    private final String type;
    private final int pricePerTransfer;

    TypeOfTransport (String type, int pricePerTransfer) {
        this.type = type;
        this.pricePerTransfer = pricePerTransfer;
    }

    public String getType() {
        return type;
    }

    public int getPricePerTransfer() {
        return pricePerTransfer;
    }
}
