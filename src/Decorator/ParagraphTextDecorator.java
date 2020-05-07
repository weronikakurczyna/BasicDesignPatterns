package Decorator;

public class ParagraphTextDecorator extends TextDecorator {

    public ParagraphTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    public String addParagraph() {
        return "<p>" + decoratedText.getText() + "</p>";
    }

    @Override
    public void write() {
        setText(addParagraph());
        decoratedText.write();
    }



}
