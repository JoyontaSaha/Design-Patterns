package creational.factory_pattern_application;

import util.Global;

/*
    Concrete Product
 */
public class WindowButton implements Button{
    @Override
    public void render() {
        Global.logger.info("::WINDOW BUTTON::");
        click();
    }

    @Override
    public void click() {
        Global.logger.info("WINDOW BUTTON SAYS:: Welcome to Windows!!!");
    }
}
