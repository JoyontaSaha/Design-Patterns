package creational.factory_pattern_application;

/*
    Concrete Creator
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
