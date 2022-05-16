package creational.abstract_factory_pattern_application;

import util.Global;

public class LinuxButton implements Button{
    @Override
    public void paint() {
        Global.logger.info("::LINUX BUTTON IS RENDERED::");
    }
}
