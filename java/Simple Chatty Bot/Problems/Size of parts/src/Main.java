import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entries = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < entries; i++) {
            int input = scanner.nextInt();

            if (input > 0) {
                larger += 1;
            } else if (input < 0) {
                smaller += 1;
            } else {
                perfect += 1;
            }
        }

        System.out.print(perfect + " ");
        System.out.print(larger + " ");
        System.out.print(smaller);
    }
}