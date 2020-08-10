package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need:");

        // Capture number of cups to plan for
        Scanner scanner = new Scanner(System.in);
        int cupsCoffee = scanner.nextInt();

        // Calculate amount of ingredients
        int mlWater = cupsCoffee * 200;
        int mlMilk = cupsCoffee * 50;
        int gCoffee = cupsCoffee * 15;

        // Report out results
        System.out.println("For " + cupsCoffee + " cups of coffee you will need:");
        System.out.println(mlWater + " ml of water");
        System.out.println(mlMilk + " ml of milk");
        System.out.println(gCoffee + " g of coffee beans");

    }
}