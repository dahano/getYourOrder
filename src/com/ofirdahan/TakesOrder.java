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
        System.out.println("\n"+"What would you like to Drink?");
        String drink = "";
        drink = scanner.nextLine().toLowerCase();
        currentOrder.put(drink,1);
    }

    public void getFood(){
        System.out.println("\n"+"What would you like to Eat?");
        String food = "";
        food = scanner.nextLine();
        
        if(MenuItems.getFoodItems().contains(food)){
            System.out.println("Ok great! We have that.");
        }else{
            System.out.println("Oooo Sorry we actually dont carry that right now. Can i get you something else?");
            food = scanner.nextLine();
        }
        //System.out.println("\n"+"So that will be: "+currentOrder);
    }

    public boolean checkFood(){

        return false;
    }

}
