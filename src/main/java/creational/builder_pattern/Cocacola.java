package creational.builder_pattern;

public class Cocacola extends ColdDrinks{
    @Override
    public String name() {
        return ColdDrinksName.COCACOLA.name();
    }

    @Override
    public float price() {
        return 25.00F;
    }
}
