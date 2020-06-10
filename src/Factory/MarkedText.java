package Factory;

public class MarkedText implements Text {
    @Override
    public void print(String enteredText) {
        System.out.println("<mark> " + enteredText + " </mark>");
    }
}
