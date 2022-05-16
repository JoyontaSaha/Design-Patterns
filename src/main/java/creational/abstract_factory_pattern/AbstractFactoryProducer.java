package creational.abstract_factory_pattern;

public class AbstractFactoryProducer {

    public static AbstractFactory getFactory(FactoryEnum factoryEnum) {
        switch (factoryEnum) {
            case ROUND:
                return new RoundShapeFactory();
            default:
                return new ShapeFactory();
        }
    }
}