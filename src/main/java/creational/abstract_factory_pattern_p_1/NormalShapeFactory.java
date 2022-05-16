package creational.abstract_factory_pattern_p_1;

public class NormalShapeFactory extends Factory{
    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType){
            case RECTANGLE:
                return new Rectangle();
            default:
                return new Square();
        }
    }
}
