package AbstractFactoryExamples.journalDev.beans;

public class Server implements Computer {
    private String RAM;
    private String HDD;
    private String CPU;

    public Server(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public String getRAM() {
        return RAM;
    }

    @Override
    public String getCPU() {
        return CPU;
    }

    @Override
    public String getHDD() {
        return HDD;
    }
}
