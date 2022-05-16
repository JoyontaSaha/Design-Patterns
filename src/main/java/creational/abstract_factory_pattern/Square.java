package creational.abstract_factory_pattern;

import util.Global;

public class Square implements Shape{

    @Override
    public void draw() {
        Global.logger.info("Square Shape Drawn.");
    }
}
