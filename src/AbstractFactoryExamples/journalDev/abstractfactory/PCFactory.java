package AbstractFactoryExamples.journalDev.abstractfactory;

import AbstractFactoryExamples.journalDev.beans.Computer;
import AbstractFactoryExamples.journalDev.beans.PC;

public class PCFactory implements ComputerAbstractFactory {
    private String RAM;
    private String HDD;
    private String CPU;

    @Override
    public Computer createComputer() {
        return new PC(this.RAM, this.HDD, this.CPU);
    }

    public PCFactory(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }
}
