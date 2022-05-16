package creational.builder_pattern_application_v_3;

/* Feature */
public class Engine {
    private final double volume;
    private  double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    public void on() {
        this.started = true;
    }

    public void off() {
        this.started = false;
    }

    public boolean isStarted() {
        return this.started;
    }

    public void go(double mileage) {
        if(started) {
            this.mileage += mileage;
        } else {
            System.err.println(Constants.CANNOT_GO_PLEASE_START_YOUR_ENGINE_FIRST);
        }
    }
}
