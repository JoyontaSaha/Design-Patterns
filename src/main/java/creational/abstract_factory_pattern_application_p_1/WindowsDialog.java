package creational.abstract_factory_pattern_application_p_1;

public class WindowsDialog extends Dialog{
    @Override
    Button createButton() {
        return new WindowsButton();
    }

    @Override
    CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
