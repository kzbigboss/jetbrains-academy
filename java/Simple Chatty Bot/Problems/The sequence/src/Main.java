import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // capture input
        Scanner scanner = new Scanner(System.in);

        int limit = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                counter++;
                if (counter > limit) {
                    break;
                }
                System.out.print(i + " ");
            }
        }


    }
}