package AbstractFactoryExamples.rg.factories;

import AbstractFactoryExamples.rg.beans.*;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
