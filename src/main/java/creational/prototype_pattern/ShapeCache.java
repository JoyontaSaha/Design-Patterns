package creational.prototype_pattern;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<Integer, Shape> shapeMap = new Hashtable<>();

    public static void loadShapeCache() {
        Shape shape = new Square(ShapeType.SQUARE);
        shape.setId(1);
        shapeMap.put(shape.getId(), shape);

        shape = new Rectangle(ShapeType.RECTANGLE);
        shape.setId(2);
        shapeMap.put(shape.getId(), shape);

        shape = new Circle(ShapeType.CIRCLE);
        shape.setId(3);
        shapeMap.put(shape.getId(), shape);

    }

    public static Shape getShape(Integer shapeId) {
        return (Shape) shapeMap.get(shapeId).clone();
    }
}
