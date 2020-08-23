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

        // print status
        printStatus(amount_water, amount_milk, amount_coffee, amount_cups, amount_money);

        // determine valid transaction
        String transaction;
        do {
            System.out.println("Write action (buy, fill, take):");
            transaction = scanner.nextLine();
        } while (!validInput(transaction));

        // perform transaction
        switch (transaction) {
            case "buy":
                // determine valid item to buy
                int choice;
                do {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    choice = scanner.nextInt();
                } while (!validBuy(choice));

                // transact drink
                switch (choice) {
                    case 1:
                        amount_water -= 250;
                        amount_coffee -= 16;
                        amount_cups -= 1;
                        amount_money += 4;
                        break;
                    case 2:
                        amount_water -= 350;
                        amount_milk -= 75;
                        amount_coffee -= 20;
                        amount_cups -= 1;
                        amount_money += 7;
                        break;
                    case 3:
                        amount_water -= 200;
                        amount_milk -= 100;
                        amount_coffee -= 12;
                        amount_cups -= 1;
                        amount_money += 6;
                        break;
                }

                printStatus(amount_water, amount_milk, amount_coffee, amount_cups, amount_money);
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

                printStatus(amount_water, amount_milk, amount_coffee, amount_cups, amount_money);
                break;
            case "take":
                System.out.println("I gave you $" + amount_money);
                System.out.println();
                amount_money = 0;

                printStatus(amount_water, amount_milk, amount_coffee, amount_cups, amount_money);
                break;
        }
    }

    public static void printStatus(int water, int milk, int coffee, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();
    }

    public static boolean validInput(String input) {
        boolean result = false;

        if (input.equals("buy") || input.equals("fill") || input.equals("take")) {
            result = true;
        }
        return result;

    }

    public static boolean validBuy(int input) {
        boolean result = false;

        if (input > 0 && input <= 3) {
            result = true;
        }

        return result;
    }
}