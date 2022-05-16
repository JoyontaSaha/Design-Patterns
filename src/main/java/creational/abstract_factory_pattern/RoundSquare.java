package creational.abstract_factory_pattern;

import util.Global;

public class RoundSquare implements Shape{

    @Override
    public void draw() {
        Global.logger.info("Round Square Shape Drawn.");
    }
}
