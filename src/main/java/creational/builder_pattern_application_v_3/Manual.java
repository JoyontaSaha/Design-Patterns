package creational.builder_pattern_application_v_3;

public class Manual {
    private CarType carType;
    private Engine engine;
    private int seats;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Manual(CarType carType, Engine engine, int seats,
                  Transmission transmission, TripComputer tripComputer,
                  GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.engine = engine;
        this.seats = seats;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = Constants.EMPTY_STRING;
        info += Constants.TYPE_OF_CAR + carType + "\n";
        info += Constants.COUNT_OF_SEATS + seats + "\n";
        info += Constants.ENGINE_VOLUME + engine.getVolume() + Constants.MILEAGE + engine.getMileage() + "\n";
        info += Constants.TRANSMISSION + transmission + "\n";
        if (this.tripComputer != null) {
            info += Constants.TRIP_COMPUTER_FUNCTIONAL + "\n";
        } else {
            info += Constants.TRIP_COMPUTER_N_A + "\n";
        }
        if (this.gpsNavigator != null) {
            info += Constants.GPS_NAVIGATOR_FUNCTIONAL + "\n";
        } else {
            info += Constants.GPS_NAVIGATOR_N_A + "\n";
        }
        return info;
    }
}
