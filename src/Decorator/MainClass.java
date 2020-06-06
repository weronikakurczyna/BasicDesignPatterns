package Decorator;

public class MainClass {
    public static void main(String[] args) {

        Text paragraphedText = new PlainText();
        paragraphedText = new ParagraphTextDecorator(paragraphedText);
        paragraphedText.write();
        Text myText = new ParagraphTextDecorator(new StrongTextDecorator(new PlainText()));
        myText.write();
    }
}
