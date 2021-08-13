package epam.learning.ex1_9;

public enum TypeOfBookCover {
    SOFTCOVER ("SoftCover"),
    HARDCOVER ("HardCover");

    private final String typeOfBookCover;

    TypeOfBookCover (String typeOfMeal) {
        this.typeOfBookCover = typeOfMeal;
    }

    public String getTypeOfBookCover () {
        return typeOfBookCover;
    }
}
