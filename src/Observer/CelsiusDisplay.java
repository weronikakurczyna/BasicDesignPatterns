package Observer;

public class CelsiusDisplay extends Display {

    private TemperatureSensor subject = null;

    @Override
    public void print() {
        System.out.println("Temperatura: " + temperature + "\u2103");
    }

    CelsiusDisplay(TemperatureSensor s) {
        subject = s;
    }

    @Override
    public void update(Subject s) {
        if (s == subject) {
            System.out.println("Temperatura - stopnie Celsjusza: " + subject.getTemperatureCelsius());
        }
    }


}
