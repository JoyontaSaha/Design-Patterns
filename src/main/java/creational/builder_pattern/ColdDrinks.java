package creational.builder_pattern;

public abstract class ColdDrinks implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
