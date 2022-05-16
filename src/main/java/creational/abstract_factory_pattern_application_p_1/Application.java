package creational.abstract_factory_pattern_application_p_1;

public class Application {
    public static void main(String[] args) {
        Dialog dialog = configuration(OSName.LINUX);
        dialog.render();

        dialog = configuration(OSName.WINDOWS);
        dialog.render();
    }

    public static Dialog configuration(OSName osName) {
        switch (osName){
            case LINUX:
                return new LinuxDialog();
            default:
                return new WindowsDialog();
        }
    }
}
