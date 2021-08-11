package epam.learning.ex1_9;

public class Book {
    private static int counter;
    private int id;
    private String bookName;
    private String bookAuthor;
    private String publishingHouse;
    private int publishingYear;
    private int pageAmount;
    private int price;
    private TypeOfBookCover typeOfBookCover;

    public Book (String bookName, String bookAuthor, String publishingHouse,
                 int publishingYear, int pageAmount, int price, TypeOfBookCover typeOfBookCover) {
        this.id = ++counter;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.pageAmount = pageAmount;
        this.price = price;
        this.typeOfBookCover = typeOfBookCover;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Book.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TypeOfBookCover getTypeOfBookCover() {
        return typeOfBookCover;
    }

    public void setTypeOfBookCover(TypeOfBookCover typeOfBookCover) {
        this.typeOfBookCover = typeOfBookCover;
    }

    public void showBookInfo () {
        System.out.println("ID = " + getId() + " Author = " + getBookAuthor() +
                " CoverType = " + getTypeOfBookCover() + " PageAmount = " + getPageAmount() +
                " price = " + getPrice() + " pageAmount = " + getPageAmount() +
                " publishingYear = " + getPublishingYear());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", pageAmount=" + pageAmount +
                ", price=" + price +
                ", typeOfBookCover=" + typeOfBookCover +
                '}';
    }
}