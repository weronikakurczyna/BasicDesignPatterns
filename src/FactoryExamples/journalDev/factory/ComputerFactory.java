package FactoryExamples.journalDev.factory;

import FactoryExamples.journalDev.beans.Computer;
import FactoryExamples.journalDev.beans.PC;
import FactoryExamples.journalDev.beans.Server;

public class ComputerFactory {
    public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {
        Computer computer = null;
        switch (type) {
            case PC:
                computer = new PC(ram, hdd, cpu);
                break;
            case SERVER:
                computer = new Server(ram, hdd, cpu);
                break;
        }
        System.out.println(computer.toString());
        return computer;

    }
}
