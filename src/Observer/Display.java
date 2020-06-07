package Observer;

public abstract class Display implements Observer {

    protected double temperature;

    public abstract void print();

    @Override
    public abstract void update(Subject s);
}
