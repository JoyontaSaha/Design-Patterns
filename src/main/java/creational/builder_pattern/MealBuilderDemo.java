package creational.builder_pattern;

public class MealBuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal = mealBuilder.prepareVegMeal();
        meal.showItems();
        meal.totalPrice();


        meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();
        meal.totalPrice();
    }
}
