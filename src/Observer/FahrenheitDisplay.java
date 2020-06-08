package Observer;

import java.text.DecimalFormat;

public class FahrenheitDisplay extends Display {

    private final double celsiusToFahrenheitMultiplicand = 1.8;
    private final double celsiusToFahrenheitAdd = 32;

    @Override
    public void print() {
        System.out.println("Temperatura:" + temperature + " \u2109");
    }

    FahrenheitDisplay(TemperatureSensor s) {
        subject = s;
    }

    @Override
    public void update(Subject s) {
        DecimalFormat df = new DecimalFormat("#.##");
        double fahrenheit = ((subject.getTemperatureCelsius() * celsiusToFahrenheitMultiplicand) + celsiusToFahrenheitAdd);
        if (s == subject) {
            System.out.println("Temperatura: " + df.format(fahrenheit) + " \u2109");
        }
    }
}
