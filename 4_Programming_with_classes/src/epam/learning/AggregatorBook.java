package epam.learning;

import java.util.ArrayList;

public class AggregatorBook{

    private ArrayList<Book> bookArrayList = new ArrayList<Book>();

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public void setBookArrayList(ArrayList<Book> bookArrayList) {
        this.bookArrayList = bookArrayList;
    }

    //TODO
    public ArrayList<Book> getBookByAuthor (String author) {
        ArrayList<Book> innerBookArrayList = new ArrayList<Book>();
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getAuthor().equals(author)) {
                innerBookArrayList.add(bookArrayList.get(i));
            }
        }
        return innerBookArrayList;
    }

    public void showBookByAuthor (ArrayList<Book> bookArrayList) {
        for (int i = 0; i < bookArrayList.size(); i++) {
                System.out.println(bookArrayList.get(i).getBookName());
        }
    }

    public void showPublisherHouseBook (String publisherHouse) {
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getPublishingHouse().equals(publisherHouse)) {
                System.out.println(bookArrayList.get(i).getBookName());
            }
        }
    }

    public void showBooksPublishingSinceSomeYear (int year) {
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getPublishingYear() >= year) {
                System.out.println(bookArrayList.get(i).getBookName());
            }
        }
    }



}
