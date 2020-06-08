package Observer;

public class MainClass {
    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor(18.8);
        CelsiusDisplay cd = new CelsiusDisplay(ts);
        FahrenheitDisplay fd = new FahrenheitDisplay(ts);
        KelvinDisplay kd = new KelvinDisplay(ts);

        ts.addObserver(cd);
        ts.addObserver(fd);
        ts.addObserver(kd);
        ts.setTemperatureCelsius(20);
        ts.setTemperatureCelsius(40.5);
        ts.setTemperatureCelsius(-15.6);
    }
}
