package creational.abstract_factory_pattern;

public class RoundShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(ShapeEnum shapeEnum) {
        switch (shapeEnum) {
            case RECTANGLE:
                return new RoundRectangle();
            default:
                return new RoundSquare();
        }
    }
}
