package com.ofirdahan;

public class Main {

    public static void main(String[] args) {

        TakesOrder newOrder = new TakesOrder();
        MenuItems fullMenu = new MenuItems();

        System.out.println("Welcome to Ofirs Tiny Restaurant!!" + "\n");
        System.out.println("Here is our Food Menu: "+"\n"+fullMenu.getFoodItems()+"\n"+
                "\n"+"And here is our Drink Menu: "+"\n" + fullMenu.getDrinkItems());

        newOrder.getFood();
        newOrder.getDrink();
        System.out.println("\n"+"Great so that will be: "+TakesOrder.currentOrder);


    }
}
