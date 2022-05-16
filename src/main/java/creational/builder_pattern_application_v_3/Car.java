package creational.builder_pattern_application_v_3;

import java.util.Objects;

/* Product */
public class Car {
    private CarType carType;
    private Engine engine;
    private int seats;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, Engine engine, int seats, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.engine = engine;
        this.seats = seats;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.tripComputer = tripComputer;
        if(!Objects.isNull(tripComputer)) {
            this.tripComputer.setCar(this);
        }
    }

    public CarType getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
