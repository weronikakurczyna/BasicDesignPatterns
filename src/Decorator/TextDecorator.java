package Decorator;

public abstract class TextDecorator extends Text {
    protected Text decoratedText;

    public Text getDecoratedText() {
        return decoratedText;
    }

    public void setDecoratedText(Text decoratedText) {
        this.decoratedText = decoratedText;
    }

    TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }

    @Override
    public void write() {
        decoratedText.write();
    }

}
