package AbstractFactoryExamples.journalDev.abstractfactory;

import AbstractFactoryExamples.journalDev.beans.Computer;
import AbstractFactoryExamples.journalDev.beans.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private String RAM;
    private String HDD;
    private String CPU;

    @Override
    public Computer createComputer() {
        return new Server(this.RAM, this.HDD, this.CPU);
    }

    public ServerFactory(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }
}
