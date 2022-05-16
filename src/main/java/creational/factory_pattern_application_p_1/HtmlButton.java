package creational.factory_pattern_application_p_1;

import util.Global;

public class HtmlButton implements Button{
    @Override
    public void click() {
        Global.logger.info(Constants.HTML_BUTTON_CLICKED);
    }
}
