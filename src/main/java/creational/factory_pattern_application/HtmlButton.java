package creational.factory_pattern_application;

import util.Global;

/*
    Concrete Product
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        Global.logger.info("::HTML BUTTON::");
        click();
    }

    @Override
    public void click() {
        Global.logger.info("HTML BUTTON SAYS:: Welcome to Web!!!");
    }
}
