package AbstractFactoryExamples.journalDev.abstractfactory;

import AbstractFactoryExamples.journalDev.beans.Computer;
import AbstractFactoryExamples.journalDev.beans.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {

    @Override
    public Computer createComputer() {
        return new Laptop();
    }
}
