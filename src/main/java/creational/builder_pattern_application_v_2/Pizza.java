package creational.builder_pattern_application_v_2;

/* Product */
public class Pizza {
    private PizzaType pizzaType;
    private Dough dough;
    private Sauce sauce;
    private TOPPING topping;

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setTopping(TOPPING topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaType=" + pizzaType +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", topping=" + topping +
                '}';
    }
}
