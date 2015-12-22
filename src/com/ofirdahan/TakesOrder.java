package com.ofirdahan;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TakesOrder {
    static Map<String, Integer> currentOrder = new TreeMap<>();

    Scanner scanner = new Scanner(System.in);

    public void getDrink() {
        System.out.println("\n"+"What would you like to Drink?");
        String drink = scanner.nextLine();
        checker(drink);
        if(checker(drink)){
            System.out.println("Great! I'll add that as well");
            currentOrder.put(drink,1);
        }else{
            System.out.println("Ooo sorry we dont carry that!");
            getDrink();
        }
    }

    public void getFood(){
        System.out.println("\n"+"What would you like to Eat?");
        String food = scanner.nextLine();
        checker(food);
        if(checker(food)){
            System.out.println("Great! I'll add that to the current order");
            currentOrder.put(food,1);
        }else{
            System.out.println("Ooo sorry we dont carry that!");
            getFood();
        }
    }
    //TODO: input should not be case sensitive at all. Users should be able to type in all-caps or all lowerCase without error;
    public boolean checker(String item){
        char upperCase = item.toUpperCase().charAt(0);
        item = item.replace(item.charAt(0), upperCase);
        return MenuItems.foodItems.contains(item) || MenuItems.getDrinkItems().contains(item);
    }

}