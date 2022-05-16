package creational.abstract_factory_pattern_application;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory){
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void render() {
        button.paint();
        checkBox.paint();
    }
}
