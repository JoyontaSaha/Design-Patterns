package creational.singleton_pattern_application;

import util.Global;

public class Application {
    public static void main(String[] args) {
        Singleton.getInstance("Hello").printValue();
        Global.logger.info(String.valueOf(Singleton.getInstance("Hello").hashCode()));
        Singleton.getInstance("World").printValue();
        Global.logger.info(String.valueOf(Singleton.getInstance("World").hashCode()));
    }
}
