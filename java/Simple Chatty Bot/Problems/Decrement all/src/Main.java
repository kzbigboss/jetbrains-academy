import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // capture four numbers
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();

        // decrement numbers
        one--;
        two--;
        three--;
        four--;

        // print results
        System.out.print(one);
        System.out.print(" ");
        System.out.print(two);
        System.out.print(" ");
        System.out.print(three);
        System.out.print(" ");
        System.out.print(four);
    }
}