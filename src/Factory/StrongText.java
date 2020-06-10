package Factory;

public class StrongText implements Text {
    @Override
    public void print(String enteredText) {
        System.out.println("<strong> " + enteredText + " </strong>");
    }
}
