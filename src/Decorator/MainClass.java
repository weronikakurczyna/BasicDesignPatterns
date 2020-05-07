package Decorator;

public class MainClass {
    public static void main(String[] args) {

        Text paragraphedText = new ParagraphTextDecorator(new PlainText());
        paragraphedText.write();

    }
}
