package Observer;

public abstract class Display implements Observer {

    protected TemperatureSensor subject = null;

    protected double temperature;

    public abstract void print();

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public abstract void update(Subject s);
}
