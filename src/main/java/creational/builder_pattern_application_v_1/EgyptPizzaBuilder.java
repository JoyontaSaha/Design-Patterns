package creational.builder_pattern_application_v_1;

/* Concrete Builder */
public class EgyptPizzaBuilder extends PizzaBuilder{
    @Override
    protected void buildDough() {
        pizza.setDough(Dough.PAN_HOT);
    }

    @Override
    protected void buildSauce() {
        pizza.setSauce(Sauce.CHILLI);
    }

    @Override
    protected void buildTopping() {
        pizza.setTopping(TOPPING.CHEESE);
    }
}
