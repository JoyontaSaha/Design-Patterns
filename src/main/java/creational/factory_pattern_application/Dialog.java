package creational.factory_pattern_application;

/*
    Creator
 */
public abstract class Dialog {
    public void renderView() {
        /*.....Some Core Business Related Codes....*/
        Button okButton = createButton();
        okButton.render();
    }

    // Factory Method
    public abstract Button createButton();
}
