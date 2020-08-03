import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // capture int input
        int input = scanner.nextInt();

        // check value
        boolean result = input < 10 && input > 0;

        // report value
        System.out.println(result);
    }
}