package creational.abstract_factory_pattern_application_p_1;

import util.Global;

public class LinuxButton implements Button{
    @Override
    public void click() {
        Global.logger.info(Constants.LINUX_BUTTON_CLICKED);
    }
}
