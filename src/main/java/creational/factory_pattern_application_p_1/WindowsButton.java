package creational.factory_pattern_application_p_1;

import util.Global;

public class WindowsButton implements Button{
    @Override
    public void click() {
        Global.logger.info(Constants.WINDOWS_BUTTON_CLICKED);
    }
}
