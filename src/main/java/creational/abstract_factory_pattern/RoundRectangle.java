package creational.abstract_factory_pattern;

import util.Global;

public class RoundRectangle implements Shape{

    @Override
    public void draw() {
        Global.logger.info("Round Rectangle Shape Drawn.");
    }
}
