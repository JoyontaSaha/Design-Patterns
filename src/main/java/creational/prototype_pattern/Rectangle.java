package creational.prototype_pattern;

import util.Global;

public class Rectangle extends Shape{
    public Rectangle(ShapeType shapeType) {
        this.type = shapeType;
    }

    @Override
    public void draw() {
        Global.logger.info(Constants.RECTANGLE_DRAWN);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "type=" + type +
                '}';
    }
}
