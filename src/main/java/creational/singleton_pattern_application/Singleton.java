package creational.singleton_pattern_application;

import util.Global;

import java.util.Objects;

public class Singleton {
    private static Singleton instance;
    private String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(Objects.isNull(instance)) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public void printValue() {
        Global.logger.info(value);
    }

}
