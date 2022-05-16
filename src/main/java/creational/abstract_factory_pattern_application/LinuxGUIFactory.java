package creational.abstract_factory_pattern_application;

public class LinuxGUIFactory extends GUIFactory{
    @Override
    Button createButton() {
        return new LinuxButton();
    }

    @Override
    CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
