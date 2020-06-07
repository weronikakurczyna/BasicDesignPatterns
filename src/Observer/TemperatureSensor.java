package Observer;

//https://docs.oracle.com/javase/7/docs/api/java/util/Observable.html#Observable()
//Instead of using Observable and Observer classes from java.util package I created my own, because these classes has been deprecated.


public class TemperatureSensor extends Subject {

    private double temperatureCelsius;

    public TemperatureSensor(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
        notifyObservers();
    }



}
