package creational.abstract_factory_pattern_application_p_1;

import util.Global;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void select() {
        Global.logger.info(Constants.WINDOWS_CHECKBOX_SELECTED);
    }
}
