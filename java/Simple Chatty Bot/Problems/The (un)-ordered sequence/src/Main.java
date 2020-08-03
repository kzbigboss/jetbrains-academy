import java.util.Scanner;

class Main {

//    public static int gcd(int a, int b) {
//        while (b > 0) {
//            int c = a % b;
//            a = b;
//            b = c;
//        }
//        return a;
//    }

    public static void main(String[] args) {
//        System.out.print(gcd(3,7));

        Scanner scanner = new Scanner(System.in);

        int previous = scanner.nextInt();
        int current = scanner.nextInt();
        boolean orderAcending = false;
        boolean orderDecending = false;

        while (true) {
            // stop evaluating if zero is input
            if (current == 0) {
                break;
            }

            if (current >= previous) {
                orderAcending = true;
            } else {
                orderDecending = true;
            }

            previous = current;
            current = scanner.nextInt();
        }

        if (orderAcending && orderDecending) {
            System.out.print("false");
        } else {
            System.out.print("true");
        }

    }
}