package creational.builder_pattern_application_v_1;

/* Concrete Builder */
public class ItalianPizzaBuilder extends PizzaBuilder{
    @Override
    protected void buildDough() {
        pizza.setDough(Dough.CROSS);
    }

    @Override
    protected void buildSauce() {
        pizza.setSauce(Sauce.TOMATO);
    }

    @Override
    protected void buildTopping() {
        pizza.setTopping(TOPPING.MUSHROOM);
    }
}
