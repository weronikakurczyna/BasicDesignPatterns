package Compositev2;

import java.util.ArrayList;

abstract class BookAbstract {

    protected String title;
    protected abstract String getBookTitle();

    public abstract ArrayList<BookAbstract> getSections();

    public abstract void add(BookAbstract b);
    public abstract void remove(BookAbstract b);

    public String toString() {
        return title;
    }

}
