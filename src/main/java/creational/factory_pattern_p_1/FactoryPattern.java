package creational.factory_pattern_p_1;

public class FactoryPattern {
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case RECTANGLE:
                return new Rectangle();
            case CIRCLE:
                return new Circle();
            default:
                return new Square();
        }
    }
}
