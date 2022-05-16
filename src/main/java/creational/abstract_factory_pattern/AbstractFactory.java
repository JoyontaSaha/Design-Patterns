package creational.abstract_factory_pattern;

public abstract class AbstractFactory {
    abstract Shape getShape(ShapeEnum shapeName);
}
