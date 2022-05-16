package creational.builder_pattern_application_v_3;

import util.Global;

/* Feature */
public class TripComputer {
    private Car car;
    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        Global.logger.info(Constants.FUEL_LEVEL + this.car.getFuel());
    }

    public void showStatus() {
        if(car.getEngine().isStarted()) {
            Global.logger.info(Constants.CAR_IS_STARTED);
        } else {
            Global.logger.info(Constants.CAR_IS_NOT_STARTED);
        }
    }
}
