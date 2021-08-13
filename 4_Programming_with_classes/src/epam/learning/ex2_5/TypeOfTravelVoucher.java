package epam.learning.ex2_5;

public enum TypeOfTravelVoucher {
    RELAXATION ("relaxation", 120),
    EXCURSION ("excursion", 80),
    TREATMENT ("treatment", 150),
    SHOPPING ("shopping", 20),
    CRUISE ("cruise", 100);

    private final String type;
    private final int pricePerDay;

    TypeOfTravelVoucher (String type, int pricePerDay) {
        this.type = type;
        this.pricePerDay = pricePerDay;
    }

    public String getType() {
        return type;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

}
