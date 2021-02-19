package AbstractFactoryExamples.rg.factories;

import AbstractFactoryExamples.rg.beans.Button;
import AbstractFactoryExamples.rg.beans.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
