package Compositev2;

import java.util.ArrayList;

public class Section extends BookAbstract {

    public Section(String title) {
        this.title = title;
    }

    @Override
    protected String getBookTitle() {
        return title;
    }

    @Override
    public ArrayList<BookAbstract> getSections() {
        return null;
    }

    @Override
    public void add(BookAbstract b) {

    }

    @Override
    public void remove(BookAbstract b) {

    }

}
