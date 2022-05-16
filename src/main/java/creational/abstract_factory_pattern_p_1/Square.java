package creational.abstract_factory_pattern_p_1;

import util.Global;

public class Square implements Shape{
    @Override
    public void draw() {
        Global.logger.info(Constants.SQUARE_DRAWN);
    }
}
