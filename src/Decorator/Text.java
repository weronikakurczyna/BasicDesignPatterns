package Decorator;

public abstract class Text {

    protected String text = "DEFAULT";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public abstract void write();

}
