package BuilderExamples.rg.builders;

import BuilderExamples.rg.cars.CarType;
import BuilderExamples.rg.components.Engine;
import BuilderExamples.rg.components.GPSNavigator;
import BuilderExamples.rg.components.Transmission;
import BuilderExamples.rg.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
