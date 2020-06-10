package Factory;

public class EmphasizedText implements Text {
    @Override
    public void print(String enteredText) {
        System.out.println("<em> " + enteredText + " </em>");
    }
}
