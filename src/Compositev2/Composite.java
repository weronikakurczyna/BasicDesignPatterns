package Compositev2;

import java.util.ArrayList;

public class Composite extends BookAbstract {

    private ArrayList<BookAbstract> sections = new ArrayList<BookAbstract>();

    public ArrayList<BookAbstract> getSections() {
        return sections;
    }

    public Composite(String title) {
        this.title = title;
    }

    @Override
    protected String getBookTitle() {
        return title;
    }

    @Override
    public void add(BookAbstract b) {
        sections.add(b);
    }

    @Override
    public void remove(BookAbstract b) {
        sections.remove(b);
    }

    public void print() {
        int i = 1, j = 1, k = 1;
        for (BookAbstract a : getSections()) {
            System.out.println(i + ". " + a);
            for (BookAbstract b : a.getSections()) {
                System.out.println("\t" + i + "." + j + ". " + b);
                for (BookAbstract c : b.getSections()) {
                    System.out.println("\t\t" + i + "." + j + "." + k + ". " + c);
                    k++;
                }
                j++;
                k = 1;
            }
            i++;
            j = 1;
        }
    }
}

