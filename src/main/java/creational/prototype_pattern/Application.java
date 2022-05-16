package creational.prototype_pattern;

import util.Global;

public class Application {
    public static void main(String[] args) {
        ShapeCache.loadShapeCache();

        Shape shape = ShapeCache.getShape(1);
        Global.logger.info(shape.toString());
        shape.draw();

        shape = ShapeCache.getShape(2);
        Global.logger.info(shape.toString());
        shape.draw();

        shape = ShapeCache.getShape(3);
        Global.logger.info(shape.toString());
        shape.draw();
    }
}
