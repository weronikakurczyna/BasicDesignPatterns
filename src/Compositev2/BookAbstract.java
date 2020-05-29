package Compositev2;

import java.util.ArrayList;

abstract class BookAbstract {

    protected String title;

    public BookAbstract(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    protected ArrayList<BookAbstract> sections = new ArrayList<BookAbstract>();

    public abstract void add(BookAbstract b);

    public abstract void remove(BookAbstract b);

    public String toString() {
        return title;
    }

    protected abstract void printBook(String tab, String parentNumber, int currentNumber);

}