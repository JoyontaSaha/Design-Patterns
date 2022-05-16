package creational.factory_pattern_p_1;

public class Application {
    public static void main(String[] args) {
        FactoryPattern factoryPattern = new FactoryPattern();

        Shape shape = factoryPattern.getShape(ShapeType.SQUARE);
        shape.draw();

        shape = factoryPattern.getShape(ShapeType.RECTANGLE);
        shape.draw();

        shape = factoryPattern.getShape(ShapeType.CIRCLE);
        shape.draw();
    }
}
