package Observer;

public class MainClass {

    TemperatureSensor ts = new TemperatureSensor(10.2);
    CelsiusDisplay cd = new CelsiusDisplay(ts);
    
}
