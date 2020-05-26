package Composite;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private List<Book> subsections;

    public Book(String name) {
        this.name = name;
        subsections = new ArrayList<Book>();
    }

    public void add(Book section) {
        subsections.add(section);
    }

    public void remove(Book section) {
        subsections.remove(section);
    }

    public List<Book> getSubsections() {
        return subsections;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
