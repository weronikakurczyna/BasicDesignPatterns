package AbstractFactoryExamples.rg;

import AbstractFactoryExamples.rg.factories.GUIFactory;
import AbstractFactoryExamples.rg.beans.Button;
import AbstractFactoryExamples.rg.beans.Checkbox;

/*Użytkownik nie wie jakiej konkretnej fabryki używa*/

public class App {
    private Button button;
    private Checkbox checkbox;

    public App(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
