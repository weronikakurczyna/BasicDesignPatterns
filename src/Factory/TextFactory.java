package Factory;


public class TextFactory {

    public Text getText(String enteredText, int number) {
        switch (number) {
            case 1:
                return new StrongText();
            case 2:
                return new ParagraphedText();
            case 3:
                return new EmphasizedText();
            case 4:
                return new MarkedText();
            default:
                System.out.println("Błędny wybór.");

        }
        return null;

    }
}
