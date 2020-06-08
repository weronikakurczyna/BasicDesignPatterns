package Observer;

public class MainClass {
    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor(10.2);
        CelsiusDisplay cd = new CelsiusDisplay(ts);
        ts.addObserver(cd);
        ts.setTemperatureCelsius(3.4);
    }

}
