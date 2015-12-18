package com.ofirdahan;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TakesOrder {
    private String mDrink;
    private String mFood;
    private String mAppetizer;


    public TakesOrder(String drink, String food, String appetizer){
        drink = mDrink;
        food = mFood;
        appetizer = mAppetizer;
    }

    public String getmDrink(String drink, int drinkAmount) {

        return drink;
    }

    public String getmFood() {
        String food = "";
        Scanner scanner = new Scanner(System.in);
        food = scanner.nextLine().toLowerCase();
        return food;
    }

    public String getmAppetizer() {
        return mAppetizer;
    }
}
