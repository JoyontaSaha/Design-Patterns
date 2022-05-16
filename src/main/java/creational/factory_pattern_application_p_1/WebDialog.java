package creational.factory_pattern_application_p_1;

public class WebDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
