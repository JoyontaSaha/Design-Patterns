package creational.factory_pattern_application_p_1;

public abstract class Dialog {
    public void render() {
        Button button = createButton();
        button.click();
    }

    public abstract Button createButton();
}
