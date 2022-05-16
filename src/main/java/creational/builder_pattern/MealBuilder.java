package creational.builder_pattern;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal vegMeal = new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Cocacola());
        return vegMeal;
    }

    public Meal prepareNonVegMeal() {
        Meal nonVegMeal = new Meal();
        nonVegMeal.addItem(new ChickenBurger());
        nonVegMeal.addItem(new Pepsi());
        return nonVegMeal;
    }
}
