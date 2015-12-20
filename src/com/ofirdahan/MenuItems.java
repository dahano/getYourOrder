package com.ofirdahan;


import java.util.LinkedList;
import java.util.List;

public class MenuItems {

    public static List<String> foodItems = new LinkedList<>();
    public static List<String> drinkItems = new LinkedList<>();

    public static List<String> getFoodItems() {
        foodItems.add("Salmon");
        foodItems.add("Soup");
        foodItems.add("Salad");
        foodItems.add("Vegan");
        foodItems.add("Falafel");
        return foodItems;
    }

    public static List<String> getDrinkItems() {
        drinkItems.add("Water");
        drinkItems.add("Beer");
        drinkItems.add("Wine");
        drinkItems.add("Margarita");
        drinkItems.add("Soda");
        return drinkItems;
    }
}
