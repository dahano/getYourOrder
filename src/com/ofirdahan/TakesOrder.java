package com.ofirdahan;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TakesOrder {
    private String mDrink;
    private String mFood;

    Map<String, Integer> currentOrder = new TreeMap<>();

    Scanner scanner = new Scanner(System.in);

    public void getDrink() {
        System.out.println("What would you like to Drink?");
        String drink = "";
        drink = scanner.nextLine();
        currentOrder.put(drink,1);
    }

    public void getFood(){
        System.out.println("\n"+"What would you like to Eat?");
        String food = "";
        food = scanner.nextLine();
        currentOrder.put(food,1);
        System.out.println("\n"+"So that will be: "+currentOrder);
    }

}
