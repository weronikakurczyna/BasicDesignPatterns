package AbstractFactoryExamples.journalDev;

import AbstractFactoryExamples.journalDev.abstractfactory.ComputerFactory;
import AbstractFactoryExamples.journalDev.abstractfactory.LaptopFactory;
import AbstractFactoryExamples.journalDev.abstractfactory.PCFactory;
import AbstractFactoryExamples.journalDev.abstractfactory.ServerFactory;
import AbstractFactoryExamples.journalDev.beans.Computer;

public class Test {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.createComputer(new ServerFactory("2 GB","500 GB","2.4 GHz"));
        Computer laptop = ComputerFactory.createComputer(new LaptopFactory());
    }
}
