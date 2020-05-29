package Compositev2;

public class Composite extends BookAbstract {

    public Composite(String title) {
        super(title);
    }

    @Override
    public void add(BookAbstract b) {
        sections.add(b);
    }

    @Override
    public void remove(BookAbstract b) {
        sections.remove(b);
    }

    public void printMain(String tab, String parentNumber, int currentNumber) {
        System.out.println("Książka: " + title);
        tab = "\t" + tab;
        currentNumber = 1;
        for (BookAbstract ba : sections) {
            ba.printBook(tab, parentNumber, currentNumber);
            currentNumber++;
        }
    }

    @Override
    public void printBook(String tab, String parentNumber, int currentNumber) {
        System.out.println(tab + parentNumber + currentNumber + ". " + title);
        tab = "\t" + tab;
        parentNumber += currentNumber + ".";
        currentNumber = 1;
        for (BookAbstract ba : sections) {
            ba.printBook(tab, parentNumber, currentNumber);
            currentNumber++;
        }
    }
}

