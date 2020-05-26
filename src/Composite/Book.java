package Composite;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Book> subsections;

    public Book(String name) {
        this.title = name;
        subsections = new ArrayList<Book>();
    }

    public String getTitle() {
        return title;
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

    public String toString() {
        return title;
    }

    public void print() {
        System.out.println("Książka: " + title);
        int i = 1, j = 1, k = 1;
        for (Book sections : getSubsections()) {
            System.out.println(i + ". " + sections);
            for (Book subsections : sections.getSubsections()) {
                System.out.println("\t" + i + "." + j + ". " + subsections);
                for (Book nextSubsections : subsections.getSubsections()) {
                    System.out.println("\t\t" + i + "." + j + "." + k + ". " + nextSubsections);
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