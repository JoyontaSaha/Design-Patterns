package creational.builder_pattern_application_v_3;

/* Director */
public class Director {
    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY);
        builder.setEngine(new Engine(1.2, 0));
        builder.setSeats(4);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS);
        builder.setEngine(new Engine(3.0, 0));
        builder.setSeats(2);
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setEngine(new Engine(2.5, 0));
        builder.setSeats(4);
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}
