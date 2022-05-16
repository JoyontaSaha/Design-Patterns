package creational.builder_pattern;

public class Pepsi extends ColdDrinks{
    @Override
    public String name() {
        return ColdDrinksName.PEPSI.name();
    }

    @Override
    public float price() {
        return 20.00F;
    }
}
