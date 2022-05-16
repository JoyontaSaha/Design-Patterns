package creational.abstract_factory_pattern_p_1;

public class RoundShapeFactory extends Factory{
    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case RECTANGLE:
                return new RoundRectangle();
            default:
                return new RoundSquare();
        }
    }
}
