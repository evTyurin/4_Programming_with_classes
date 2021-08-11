package epam.learning.ex2_5;

public enum TypeOfMeal {
    BREAKFAST("breakfast"),
    DINNER("dinner"),
    SUPPER("supper"),
    ALL_INCLUSIVE("all inclusive");

    public String typeOfMeal;

    private TypeOfMeal (String typeOfMeal) {
        this.typeOfMeal = typeOfMeal;
    }

    public String getTypeOfMeal () {
        return typeOfMeal;
    }
}
