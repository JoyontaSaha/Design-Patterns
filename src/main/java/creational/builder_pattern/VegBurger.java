package creational.builder_pattern;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return BurgerName.VEG_BURGER.name;
    }

    @Override
    public float price() {
        return 100.00F;
    }
}
