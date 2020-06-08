package Observer;

import java.text.DecimalFormat;

public class KelvinDisplay extends Display {

    private final double celsiusToKelvinAdd = 273.15;

    @Override
    public void print() {
        System.out.println("Temperatura:" + temperature + " K");
    }

    KelvinDisplay(TemperatureSensor s) {
        subject = s;
    }

    @Override
    public void update(Subject s) {
        DecimalFormat df = new DecimalFormat("#.##");
        double kelvin = (subject.getTemperatureCelsius() + celsiusToKelvinAdd);
        if (s == subject) {
            System.out.println("Temperatura: " + df.format(kelvin) + " K");
        }
    }
}
