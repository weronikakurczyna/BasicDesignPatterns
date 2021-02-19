package AbstractFactoryExamples.journalDev.abstractfactory;

import AbstractFactoryExamples.journalDev.beans.Computer;

public class ComputerFactory {
    public static Computer createComputer(ComputerAbstractFactory caf) {
        return  caf.createComputer();
    }
}
