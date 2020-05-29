package Compositev2;

import java.util.ArrayList;

public class Section extends BookAbstract {

    public Section(String title) {
        this.title = title;
    }

    private ArrayList<BookAbstract> sections = new ArrayList<BookAbstract>();

    @Override
    public void add(BookAbstract b) {

    }

    @Override
    public void remove(BookAbstract b) {

    }

    @Override
    public void printBook(String tab, String parentNumber, int currentNumber) {
        System.out.println(tab + parentNumber + currentNumber + ". " + title);
        tab = "\t" + tab;
        parentNumber += currentNumber;
        currentNumber = 1;
        for (BookAbstract ba : sections) {
            ba.printBook(tab, parentNumber, currentNumber);
            currentNumber++;
        }


    }
}
