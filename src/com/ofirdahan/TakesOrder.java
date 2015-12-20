package com.ofirdahan;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TakesOrder {
    private String mDrink;
    private String mFood;

    static Map<String, Integer> currentOrder = new TreeMap<>();

    Scanner scanner = new Scanner(System.in);

    public void getDrink() {
        System.out.println("\n"+"What would you like to Drink?");
        String drink = scanner.nextLine();
        checker(drink);
        if(checker(drink) == true){
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
        if(checker(food) == true){
            System.out.println("Great! I'll add that to the current order");
            currentOrder.put(food,1);
        }else{
            System.out.println("Ooo sorry we dont carry that!");
            getFood();
        }
    }

    public boolean checker(String item){
        char upperCase = item.toUpperCase().charAt(0);
        item = item.replace(item.charAt(0), upperCase);
        if(MenuItems.foodItems.contains(item) || MenuItems.getDrinkItems().contains(item)){
            return true;
        }
        else{
            return false;
        }
    }



}
