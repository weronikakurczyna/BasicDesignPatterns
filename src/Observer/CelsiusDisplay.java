package Observer;

public class CelsiusDisplay extends Display {

    @Override
    public void print() {
        System.out.println("Temperatura: " + temperature + " \u2103");
    }

    CelsiusDisplay(TemperatureSensor s) {
        subject = s;
    }

    @Override
    public void update(Subject s) {
        if (s == subject) {
            System.out.println("Temperatura: " + subject.getTemperatureCelsius() + " \u2103");
        }
    }
}
