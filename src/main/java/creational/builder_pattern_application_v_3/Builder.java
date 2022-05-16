package creational.builder_pattern_application_v_3;

/* Abstract Builder */
public abstract class Builder {
    public abstract void setCarType(CarType carType);
    public abstract void setEngine(Engine engine);
    public abstract void setSeats(int seats);
    public abstract void setTransmission(Transmission transmission);
    public abstract void setTripComputer(TripComputer tripComputer);
    public abstract void setGPSNavigator(GPSNavigator gpsNavigator);
}
