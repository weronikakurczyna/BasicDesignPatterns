package Decorator;

public class ParagraphTextDecorator extends TextDecorator {

    public ParagraphTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public void write() {
        System.out.println("<p>");
        super.write();
        System.out.println("</p>");
    }
}
