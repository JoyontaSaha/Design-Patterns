package creational.builder_pattern;

public enum BurgerName {
    VEG_BURGER("VEG BURGER"),
    CHICKEN_BURGER("CHICKEN BURGER");

    public final String name;

    BurgerName(String name) {
        this.name = name;
    }
}
