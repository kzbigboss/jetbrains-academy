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
        int necessaryCups = scanner.nextInt();

        // Calculate cups that can be made from each ingredient
        double cupsWater = (double) availableWater / 200;
        double cupsMilk = (double) availableMilk / 50;
        double cupsCoffee = (double) availableCoffee / 15;
        int availableCups = (int) Math.min(cupsWater, Math.min(cupsCoffee, cupsMilk));

        // Report out results
        if (availableCups < necessaryCups) {
            System.out.println("No, I can only make " + availableCups + " cup(s) of coffee");
        } else if (availableCups > necessaryCups) {
            int deltaCups = availableCups - necessaryCups;
            System.out.println("Yes, I can make that amount of coffee (and even " + deltaCups + " more than that)");
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }
    }
}