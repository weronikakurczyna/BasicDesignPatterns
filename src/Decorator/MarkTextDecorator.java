package Decorator;

public class MarkTextDecorator extends TextDecorator {

    public MarkTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public void write() {
        System.out.println("<mark>");
        super.write();
        System.out.println("</mark>");
    }
}
