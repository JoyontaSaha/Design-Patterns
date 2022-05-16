package creational.prototype_pattern;

import util.Global;

public class Square extends Shape{
    public Square(ShapeType shapeType) {
        this.type = shapeType;
    }

    @Override
    public void draw() {
        Global.logger.info(Constants.SQUARE_DRAWN);
    }

    @Override
    public String toString() {
        return "Square{" +
                "type=" + type +
                '}';
    }
}
