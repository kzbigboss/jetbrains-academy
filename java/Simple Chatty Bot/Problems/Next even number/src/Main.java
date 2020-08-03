import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // capture input
        int input = scanner.nextInt();

        // calc delta from next even number
        int delta = 2 - (input % 2);

        // print result
        System.out.print(input + delta);
    }
}