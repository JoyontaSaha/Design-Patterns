package creational.prototype_pattern;

public enum ShapeType {
    SQUARE("SQUARE"),
    RECTANGLE("RECTANGLE"),
    CIRCLE("CIRCLE");

    private final String name;

    ShapeType(String name) {
        this.name = name;
    }
}
