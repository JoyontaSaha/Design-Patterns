package creational.abstract_factory_pattern_p_1;

import util.Global;

public class RoundRectangle implements Shape{
    @Override
    public void draw() {
        Global.logger.info(Constants.ROUND_RECTANGLE_DRAWN);
    }
}
