package Compositev2;

public class Main {
    public static void main(String[] args) {
        Composite book = new Composite("Gramatyka Angielska");

        Composite section1 = new Composite(("Czasowniki modalne"));
        book.add(section1);
        Composite subsection11 = new Composite("Konstrukcja: Can, could, be able to");
        section1.add(subsection11);
        subsection11.add(new Section("be able to"));
        subsection11.add(new Section(" should"));

        Composite section2 = new Composite(("Czasy teraźniejsze"));
        book.add(section2);
        Composite subsection21 = new Composite("Present Continuous");
        section2.add(subsection21);
        subsection21.add(new Section("Zdania twierdzące"));
        subsection21.add(new Section("Pytania i przeczenia"));
        Composite subsection22 = new Composite("Present Simple");
        section2.add(subsection22);
        subsection22.add(new Section("Zdania twierdzące"));
        subsection22.add(new Section("Pytania i przeczenia"));

        Composite section3 = new Composite(("Czasy przeszłe"));
        book.add(section3);
        Composite subsection31 = new Composite("Past Continuous");
        section3.add(subsection31);
        subsection31.add(new Section("Zdania twierdzące"));

        book.printMain("", "", 1);
    }
}
