package Decorator;

public class PlainText extends Text {

    @Override
    public void write() {
        System.out.println("Tekst");
    }
}
