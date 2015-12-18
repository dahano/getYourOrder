package com.ofirdahan;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> currentOrder = new TreeMap<>();

        TakesOrder newOrder = new TakesOrder("","","");

        //Drink
        Scanner scanner = new Scanner(System.in);
        System.out.println("What can i get you to drink?");
        String drink = "";
        int drinkAmount = 0;
        drink = scanner.nextLine().toLowerCase();
        System.out.println("How many?");
        drinkAmount = scanner.nextInt();

        currentOrder.put(drink,drinkAmount);

        newOrder.getmDrink(drink,drinkAmount);

        newOrder.getmFood();

        //Food


        System.out.println("\n"+ currentOrder);



    }
}
