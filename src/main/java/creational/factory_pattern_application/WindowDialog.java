package creational.factory_pattern_application;

/*
    Concrete Creator
 */
public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
