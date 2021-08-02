package epam.learning;

public class Book {
    private static int id;
    private final int ID = id++;
    private String bookName;
    private String author;
    private String publishingHouse;
    private short publishingYear;
    private short pageAmount;
    private short price;
    private String coverType;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Book.id = id;
    }

    public int getID() {
        return ID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public short getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(short publishingYear) {
        this.publishingYear = publishingYear;
    }

    public short getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(short pageAmount) {
        this.pageAmount = pageAmount;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public static Book getBook() {
        return new Book();
    }

    @Override
    public String toString () {
        String toString = "ID = " + getID() + " Author = " + getAuthor() +
                " CoverType = " + getCoverType() + " PageAmount = " + getPageAmount() +
                " price = " + getPrice() + " pageAmount = " + getPageAmount() +
                " publishingYear = " + getPublishingYear();
        return toString;
    }
}