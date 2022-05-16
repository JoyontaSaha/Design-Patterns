package creational.factory_pattern_application_p_1;

public class Application {
    public static void main(String[] args) {
        Dialog dialog = configuration(OSName.WINDOWS);
        Button button = dialog.createButton();
        button.click();

        dialog = configuration(OSName.WEB);
        button = dialog.createButton();
        button.click();
    }

    public static Dialog configuration(OSName osName) {
        switch (osName) {
            case WINDOWS:
                return new WindowsDialog();
            default:
                return new WebDialog();
        }

    }
}
