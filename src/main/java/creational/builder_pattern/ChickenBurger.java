package creational.builder_pattern;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return BurgerName.CHICKEN_BURGER.name;
    }

    @Override
    public float price() {
        return 150.00F;
    }
}
