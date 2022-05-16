package creational.factory_pattern_application;

/*
    Client Code
 */
public class clientApplication {
    private static Dialog dialog = null;
    public static void main(String[] args) {
        configuration("Windows");
        runClientLogic();

        configuration("Web");
        runClientLogic();

        configuration("Linux");
        runClientLogic();
    }

    static void configuration(String os) {
        if(os.equalsIgnoreCase("WINDOWS")) {
            dialog = new WindowDialog();
        } else if(os.equalsIgnoreCase("WEB")) {
            dialog = new HtmlDialog();
        } else {
            throw new RuntimeException("UNKNOWN OS!!! NOT CONFIGURED!!!");
        }

    }

    static void runClientLogic() {
        dialog.renderView();
    }
}
