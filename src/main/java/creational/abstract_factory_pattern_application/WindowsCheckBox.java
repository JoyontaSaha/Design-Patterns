package creational.abstract_factory_pattern_application;

import util.Global;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        Global.logger.info("::WINDOWS CHECKBOX IS RENDERED::");

    }
}
