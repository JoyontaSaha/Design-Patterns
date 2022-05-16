package creational.builder_pattern_application_v_3;

import util.Global;

public class Demo {


    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);
        Car cityCar = carBuilder.getCar();
        Global.logger.info(Constants.CAR_BUILT + cityCar.getCarType().name());

        ManualBuilder manualBuilder= new ManualBuilder();
        director.constructCityCar(manualBuilder);
        Global.logger.info(Constants.CAR_MANUAL_BUILT + manualBuilder.getCarManual().print());
    }
}
