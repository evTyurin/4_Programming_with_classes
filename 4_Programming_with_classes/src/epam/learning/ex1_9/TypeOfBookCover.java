package epam.learning.ex1_9;

public enum TypeOfBookCover {
    SOFTCOVER ("SoftCover"),
    HARDCOVER ("HardCover");

    public String typeOfBookCover;

    private TypeOfBookCover (String typeOfMeal) {
        this.typeOfBookCover = typeOfMeal;
    }

    public String getTypeOfBookCover () {
        return typeOfBookCover;
    }
}
