package Decorator;

public class StrongTextDecorator extends TextDecorator {

    public StrongTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public void write() {
        System.out.println("<strong>");
        super.write();
        System.out.println("</strong>");
    }
}
