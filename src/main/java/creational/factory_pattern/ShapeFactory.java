package creational.factory_pattern;

public class ShapeFactory {

    public Shape getShape(ShapeEnum shapeEnum) {
        switch (shapeEnum) {
            case SQUARE :
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return new Circle();
        }
    }
}
