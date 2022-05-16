package creational.abstract_factory_pattern_application_p_1;

import util.Global;

public class LinuxCheckBox implements CheckBox{
    @Override
    public void select() {
        Global.logger.info(Constants.LINUX_CHECKBOX_SELECTED);
    }
}
