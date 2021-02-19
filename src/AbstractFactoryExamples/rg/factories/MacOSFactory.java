package AbstractFactoryExamples.rg.factories;
import AbstractFactoryExamples.rg.beans.Button;
import AbstractFactoryExamples.rg.beans.Checkbox;
import AbstractFactoryExamples.rg.beans.MacOSButton;
import AbstractFactoryExamples.rg.beans.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
