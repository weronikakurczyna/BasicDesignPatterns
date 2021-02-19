package FactoryExamples.journalDev;

import FactoryExamples.journalDev.beans.Computer;
import FactoryExamples.journalDev.factory.ComputerFactory;
import FactoryExamples.journalDev.factory.ComputerType;

public class Test {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1GB", "256GB", "Intel Core 2 Duo");
        Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32GB", "1TB", "AMD Ryzen 7 2700X");
    }
}
