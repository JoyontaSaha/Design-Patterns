package creational.abstract_factory_pattern_application_p_1;

public class LinuxDialog extends Dialog{
    @Override
    Button createButton() {
        return new LinuxButton();
    }

    @Override
    CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
