package creational.abstract_factory_pattern;

public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(ShapeEnum shapeEnum) {
        switch (shapeEnum) {
            case RECTANGLE:
                return new Rectangle();
            default:
                return new Square();
        }
    }
}
