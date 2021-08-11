package epam.learning.ex2_5;

public enum TypeOfTransport {
    BUS("bus"),
    TRAIN("train"),
    PLAIN("plain"),
    CAR("car"),
    SHIP("ship");

    public String typeOfTransport;

    private TypeOfTransport (String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public String getTypeOfTransport () {
        return typeOfTransport;
    }
}
