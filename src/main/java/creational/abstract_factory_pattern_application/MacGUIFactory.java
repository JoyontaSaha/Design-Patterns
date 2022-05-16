package creational.abstract_factory_pattern_application;

public class MacGUIFactory extends GUIFactory{
    @Override
    Button createButton() {
        return new MacButton();
    }

    @Override
    CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
