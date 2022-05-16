package creational.factory_pattern_p_1;

import util.Global;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        Global.logger.info(Constants.RECTANGLE_DRAWN);
    }
}
