package Decorator;

public abstract class TextDecorator extends Text {
    protected Text decoratedText;

    public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }

    public void write() {
        decoratedText.write();
    }
}
