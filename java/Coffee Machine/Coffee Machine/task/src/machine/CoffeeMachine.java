package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        // initial variables
        Scanner scanner = new Scanner(System.in);

        int amount_water = 400;
        int amount_milk = 540;
        int amount_coffee = 120;
        int amount_cups = 9;
        int amount_money = 550;

        int new_water;
        int new_milk;
        int new_coffee;
        int new_cups;

        // determine valid transaction
        String transaction;

        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            transaction = scanner.next();
            if (transaction.equals("exit")){
                break;
            }

            // perform transaction
            switch (transaction) {
                case "buy":
                    String choice;
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");

                    choice = scanner.next();

                    // transact drink
                    switch (choice) {
                        case "back":
                            break;
                        case "1":
                            new_water = amount_water - 250;
                            if (new_water < 0){
                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            new_coffee = amount_coffee - 16;
                            if (new_coffee < 0){
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            }

                            new_cups = amount_cups - 1;
                            if (new_cups < 0){
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }

                            System.out.println("I have enough resources, making you a coffee!");
                            amount_water = new_water;
                            amount_coffee = new_coffee;
                            amount_cups = new_cups;
                            amount_money += 4;
                            break;
                        case "2":
                            new_water = amount_water - 350;
                            if (new_water < 0){
                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            new_milk = amount_milk - 75;
                            if (new_milk < 0){
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }

                            new_coffee = amount_coffee - 20;
                            if (new_coffee < 0){
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            }

                            new_cups = amount_cups - 1;
                            if (new_cups < 0){
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }

                            System.out.println("I have enough resources, making you a coffee!");
                            amount_water = new_water;
                            amount_milk = new_milk;
                            amount_coffee = new_coffee;
                            amount_cups = new_cups;

                            amount_money += 7;
                            break;
                        case "3":
                            new_water = amount_water - 200;
                            if (new_water < 0){
                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            new_milk = amount_milk - 100;
                            if (new_milk < 0){
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }

                            new_coffee = amount_coffee - 12;
                            if (new_coffee < 0){
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            }

                            new_cups = amount_cups - 1;
                            if (new_cups < 0){
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }

                            System.out.println("I have enough resources, making you a coffee!");
                            amount_water = new_water;
                            amount_milk = new_milk;
                            amount_coffee = new_coffee;
                            amount_cups = new_cups;

                            amount_money += 6;
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    amount_water += scanner.nextInt();

                    System.out.println("Write how many ml of milk do you want to add:");
                    amount_milk += scanner.nextInt();

                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    amount_coffee += scanner.nextInt();

                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    amount_cups += scanner.nextInt();
                    break;

                case "take":
                    System.out.println("I gave you $" + amount_money);
                    System.out.println();
                    amount_money = 0;
                    break;

                case "remaining":
                    printStatus(amount_water, amount_milk, amount_coffee, amount_cups, amount_money);
                    break;
            }
        }

    }

    public static void printStatus(int water, int milk, int coffee, int cups, int money) {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }
}
