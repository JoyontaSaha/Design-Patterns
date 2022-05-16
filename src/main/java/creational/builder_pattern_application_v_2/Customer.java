package creational.builder_pattern_application_v_2;

import util.Global;

/* Customer Ordering a Pizza */
public class Customer {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        PizzaBuilder pizzaBuilder = new ItalianPizzaBuilder();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        Global.logger.info(pizza.toString());


        pizzaBuilder = new EgyptianPizzaBuilder();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.constructPizza();
        pizza = waiter.getPizza();
        Global.logger.info(pizza.toString());
    }
}
