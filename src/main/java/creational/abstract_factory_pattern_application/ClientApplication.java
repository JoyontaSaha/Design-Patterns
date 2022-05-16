package creational.abstract_factory_pattern_application;

public class ClientApplication {

    public static void main(String[] args) {
        Application app = getApp(OSEnum.MAC);
        app.render();

        app = getApp(OSEnum.WINDOWS);
        app.render();

        app = getApp(OSEnum.LINUX);
        app.render();
    }

    static Application getApp(OSEnum osEnum) {
        GUIFactory guiFactory = configuration(osEnum);
        return new Application(guiFactory);
    }

    static GUIFactory configuration(OSEnum osEnum) {
        switch (osEnum) {
            case MAC:
                return new MacGUIFactory();
            case LINUX:
                return new LinuxGUIFactory();
            default:
                return new WindowsGUIFactory();
        }
    }
}
