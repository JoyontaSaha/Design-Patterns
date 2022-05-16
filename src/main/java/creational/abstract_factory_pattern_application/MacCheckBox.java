package creational.abstract_factory_pattern_application;

import util.Global;

public class MacCheckBox implements CheckBox{
    @Override
    public void paint() {
        Global.logger.info("::MAC CHECKBOX IS RENDERED::");
    }
}
