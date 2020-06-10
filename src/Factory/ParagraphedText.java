package Factory;

public class ParagraphedText implements Text {
    @Override
    public void print(String enteredText) {
        System.out.println("<p> " + enteredText + " </p>");
    }
}
