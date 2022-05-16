package creational.factory_pattern;

import util.Global;

public class Circle implements Shape{

    @Override
    public void draw() {
        Global.logger.info("Circle Drawn");
    }
}
