package creational.abstract_factory_pattern_application;

import util.Global;

public class LinuxCheckBox implements CheckBox{
    @Override
    public void paint() {
        Global.logger.info("::LINUX CHECKBOX IS RENDERED::");
    }
}
