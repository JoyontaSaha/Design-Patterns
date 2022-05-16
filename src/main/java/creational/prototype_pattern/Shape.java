package creational.prototype_pattern;

import util.Global;

public abstract class Shape implements Cloneable {
    private Integer id;
    protected ShapeType type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public abstract void draw();

    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException exception) {
            Global.logger.warning(exception.toString());
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id=" + id +
                ", type=" + type +
                '}';
    }
}
