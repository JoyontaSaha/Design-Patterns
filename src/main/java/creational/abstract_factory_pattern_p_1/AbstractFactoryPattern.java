package creational.abstract_factory_pattern_p_1;

public class AbstractFactoryPattern {
    public Factory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case ROUND:
                return new RoundShapeFactory();
            default:
                return new NormalShapeFactory();
        }
    }
}
