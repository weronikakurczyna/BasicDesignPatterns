package Composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Book book = new Book("Gramatyka Angielska");

        Book section1 = new Book("Czasowniki modalne");
        Book section2 = new Book("Czasy teraźniejsze");
        Book section3 = new Book("Czasy przeszłe");

        Book subsection11 = new Book("Konstrukcja: Can, could, be able to");
        Book subsection12 = new Book("Konstrukcja: should");
        Book subsection21 = new Book("Present Continuous");
        Book subsection22 = new Book("Present Simple");
        Book subsection31 = new Book("Past Simple");
        Book subsection32 = new Book("Past Perfect");

        Book nextSubsection111 = new Book("be able to");
        Book nextSubsection121 = new Book("should");
        Book nextSubsection211 = new Book("Zdania twierdzące (Present Continuous)");
        Book nextSubsection212 = new Book("Pytania i przeczenia (Present Continuous)");
        Book nextSubsection221 = new Book("Zdania twierdzące (Present Simple)");
        Book nextSubsection222 = new Book("Pytania i przeczenia (Present Simple)");
        Book nextSubsection311 = new Book("Budowa zdania w czasie Past Simple");
        Book nextSubsection321 = new Book("Budowa zdania w czasie Past Perfect");

        book.add(section1);
        book.add(section2);
        book.add(section3);

        section1.add(subsection11);
        section1.add(subsection12);
        section2.add(subsection21);
        section2.add(subsection22);
        section3.add(subsection31);
        section3.add(subsection32);

        subsection11.add(nextSubsection111);
        subsection12.add(nextSubsection121);
        subsection21.add(nextSubsection211);
        subsection21.add(nextSubsection212);
        subsection22.add(nextSubsection221);
        subsection22.add(nextSubsection222);
        subsection31.add(nextSubsection311);
        subsection32.add(nextSubsection321);

        book.print();
    }
}
