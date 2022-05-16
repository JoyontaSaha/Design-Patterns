package creational.abstract_factory_pattern_application_p_1;

public abstract class Dialog {
    public void render() {
        Button button = createButton();
        button.click();
        CheckBox checkBox = createCheckBox();
        checkBox.select();
    }

    abstract Button createButton();
    abstract CheckBox createCheckBox();
}
