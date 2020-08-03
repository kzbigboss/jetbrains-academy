import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entries = scanner.nextInt();
        int sumDiv6 = 0;

        for (int i = 0; i < entries; i++) {
            int input = scanner.nextInt();

            sumDiv6 += (input % 6 == 0) ? input : 0;
        }

        System.out.println(sumDiv6);
    }
}