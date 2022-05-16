package creational.abstract_factory_pattern;

import util.Global;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        Global.logger.info("Rectangle Shape Drawn.");
    }
}
