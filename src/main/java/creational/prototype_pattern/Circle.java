package creational.prototype_pattern;

import util.Global;

public class Circle extends Shape{
    public Circle(ShapeType shapeType) {
        this.type = shapeType;
    }

    @Override
    public void draw() {
        Global.logger.info(Constants.CIRCLE_DRAWN);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "type=" + type +
                '}';
    }
}
