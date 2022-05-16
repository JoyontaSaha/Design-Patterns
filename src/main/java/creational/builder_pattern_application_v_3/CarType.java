package creational.builder_pattern_application_v_3;

/* Feature */
public enum CarType {
    CITY("CITY"),
    SPORTS("SPORTS"),
    SUV("SUV");

    private final String name;

    CarType(String type) {
        this.name = type;
    }
}
