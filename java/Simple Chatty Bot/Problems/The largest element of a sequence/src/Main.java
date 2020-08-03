import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int max = input;

        while (input != 0) {
            if (max < input) {
                max = input;
            }

            input = scanner.nextInt();
        }

        System.out.println(max);
    }
}