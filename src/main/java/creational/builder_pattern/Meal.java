package creational.builder_pattern;

import util.Global;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float totalPrice() {
        float totalPrice = 0.0f;
        for (Item item: items) {
            totalPrice += item.price();
        }
        Global.logger.info(String.valueOf(totalPrice+ "$"));
        return totalPrice;
    }

    public void showItems() {
        String itemsName = "[";
        for (Item item: items) {
            itemsName += item.name() + ", ";
        }
        // Replacing last occurrence of ", " by "]";
        // Here $ means at the last
        Global.logger.info(itemsName.replaceAll(", $","]"));
    }
}
