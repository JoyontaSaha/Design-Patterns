package creational.builder_pattern_application_v_2;

/* Concrete Builder */
public class EgyptianPizzaBuilder extends PizzaBuilder {
    @Override
    protected void setPizzaType() {
        pizza.setPizzaType(PizzaType.EGYPTIAN);
    }

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
