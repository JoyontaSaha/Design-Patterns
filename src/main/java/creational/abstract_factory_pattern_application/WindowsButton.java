package creational.abstract_factory_pattern_application;

import util.Global;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        Global.logger.info("::WINDOWS BUTTON IS RENDERED::");
    }
}
