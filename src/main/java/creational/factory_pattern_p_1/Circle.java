package creational.factory_pattern_p_1;

import util.Global;

public class Circle implements Shape{
    @Override
    public void draw() {
        Global.logger.info(Constants.CIRCLE_DRAWN);
    }
}
