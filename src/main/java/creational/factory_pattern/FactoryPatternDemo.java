package creational.factory_pattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape(ShapeEnum.CIRCLE);
        shape.draw();

        shape = shapeFactory.getShape(ShapeEnum.RECTANGLE);
        shape.draw();

        shape = shapeFactory.getShape(ShapeEnum.SQUARE);
        shape.draw();
    }
}
