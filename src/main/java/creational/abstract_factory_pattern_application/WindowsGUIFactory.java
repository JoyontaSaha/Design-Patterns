package creational.abstract_factory_pattern_application;

public class WindowsGUIFactory extends GUIFactory{
    @Override
    Button createButton() {
        return new WindowsButton();
    }

    @Override
    CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
