package epam.learning.ex1_9;

import java.util.ArrayList;

public class AggregatorBook{

    private ArrayList<Book> bookArrayList;

    public AggregatorBook () {
        bookArrayList = new ArrayList<Book>();
    }

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public void setBookArrayList(ArrayList<Book> bookArrayList) {
        this.bookArrayList = bookArrayList;
    }

    public ArrayList<Book> getBookByAuthor (String author) {
        ArrayList<Book> innerBookArrayList = new ArrayList<Book>();
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getBookAuthor().equals(author)) {
                innerBookArrayList.add(bookArrayList.get(i));
            }
        }
        return innerBookArrayList;
    }

    public void showBook (ArrayList<Book> bookArrayList) {
        for (int i = 0; i < bookArrayList.size(); i++) {
                System.out.println(bookArrayList.get(i).getBookName());
        }
    }

    public ArrayList<Book> getBookByPublisherHouse (String publisherHouse) {
        ArrayList<Book> innerBookArrayList = new ArrayList<Book>();
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getPublishingHouse().equals(publisherHouse)) {
                innerBookArrayList.add(bookArrayList.get(i));
            }
        }
        return innerBookArrayList;
    }


    public ArrayList<Book> getBookByPublishingYear (int year) {
        ArrayList<Book> innerBookArrayList = new ArrayList<Book>();
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getPublishingYear() >= year) {
                innerBookArrayList.add(bookArrayList.get(i));
            }
        }
        return innerBookArrayList;
    }

}
