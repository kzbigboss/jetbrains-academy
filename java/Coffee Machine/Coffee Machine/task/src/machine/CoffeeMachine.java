package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        // Capture inputs
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int availableWater = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int availableMilk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int availableCoffee = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cupsCoffee = scanner.nextInt();

        // Calculate necessary amount of ingredients
        int necessaryWater = cupsCoffee * 200;
        int necessaryMilk = cupsCoffee * 50;
        int necessaryCoffee = cupsCoffee * 15;

        // Determine if machine can make requested amount of coffee
        int enoughWater = necessaryWater / availableWater;
        int enoughMilk = necessaryMilk / availableMilk;
        int enoughCoffee = necessaryCoffee / availableCoffee;

        // Determine minimum amount of coffee that can be made
        int minCups = Math.min(enoughCoffee, Math.min(enoughWater, enoughMilk));

        // Report out results
        if (cupsCoffee <= minCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("No, I can only makes " + minCups + " cups(s) of coffee");
        }
    }
}