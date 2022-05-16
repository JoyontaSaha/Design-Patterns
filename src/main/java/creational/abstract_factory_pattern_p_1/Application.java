package creational.abstract_factory_pattern_p_1;

public class Application {
    public static void main(String[] args) {
        AbstractFactoryPattern abstractFactoryPattern = new AbstractFactoryPattern();

        Factory factory = abstractFactoryPattern.getFactory(FactoryType.NORMAL);
        Shape shape = factory.getShape(ShapeType.SQUARE);
        shape.draw();

        shape = factory.getShape(ShapeType.RECTANGLE);
        shape.draw();

        factory = abstractFactoryPattern.getFactory(FactoryType.ROUND);
        shape = factory.getShape(ShapeType.SQUARE);
        shape.draw();

        shape = factory.getShape(ShapeType.RECTANGLE);
        shape.draw();
    }
}
