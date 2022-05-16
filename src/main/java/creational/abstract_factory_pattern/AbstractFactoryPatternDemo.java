package creational.abstract_factory_pattern;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getFactory(FactoryEnum.DEFAULT);

        Shape shape = abstractFactory.getShape(ShapeEnum.SQUARE);
        shape.draw();

        shape = abstractFactory.getShape(ShapeEnum.RECTANGLE);
        shape.draw();

        abstractFactory = AbstractFactoryProducer.getFactory(FactoryEnum.ROUND);


        shape = abstractFactory.getShape(ShapeEnum.SQUARE);
        shape.draw();

        shape = abstractFactory.getShape(ShapeEnum.RECTANGLE);
        shape.draw();
    }
}
