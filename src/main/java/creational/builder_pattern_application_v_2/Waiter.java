package creational.builder_pattern_application_v_2;

/* Director */
public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void constructPizza() {
        this.pizzaBuilder.createPizzaProduct();
        this.pizzaBuilder.setPizzaType();
        this.pizzaBuilder.buildDough();
        this.pizzaBuilder.buildSauce();
        this.pizzaBuilder.buildTopping();
    }

    public Pizza getPizza() {
        return this.pizzaBuilder.getPizza();
    }
}
