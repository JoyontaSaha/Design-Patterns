package creational.abstract_factory_pattern_p_1;

import util.Global;

public class RoundSquare implements Shape{
    @Override
    public void draw() {
        Global.logger.info(Constants.ROUND_SQUARE_DRAWN);
    }
}
