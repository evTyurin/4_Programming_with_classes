package epam.learning.ex2_5;

public enum TypeOfMeal {
    BREAKFAST("breakfast", 5),
    DINNER("dinner", 10),
    SUPPER("supper", 10),
    ALL_INCLUSIVE("all inclusive", 40);

    private final String type;
    private final int pricePerDay;


    TypeOfMeal (String type, int pricePerDay) {
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
