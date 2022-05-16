package creational.singleton_pattern;

import util.Global;

public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

    public void print() {
        Global.logger.info(Constants.I_AM_A_SINGLETON_OBJECT);
    }
}
