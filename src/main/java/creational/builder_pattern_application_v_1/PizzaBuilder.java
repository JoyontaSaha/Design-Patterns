package creational.builder_pattern_application_v_1;

/* Abstract Builder */
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return this.pizza;
    }

    public void createPizzaProduct() {
        this.pizza = new Pizza();
    }

    protected abstract void buildDough();
    protected abstract void buildSauce();
    protected abstract void buildTopping();
}
