package creational.abstract_factory_pattern_application;

import util.Global;

public class MacButton implements Button{
    @Override
    public void paint() {
        Global.logger.info("::MAC BUTTON IS RENDERED::");
    }
}
