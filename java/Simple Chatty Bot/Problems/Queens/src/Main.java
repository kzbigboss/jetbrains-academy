import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // parse chess piece locations
        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();
        double x2 = scanner.nextInt();
        double y2 = scanner.nextInt();

        // determine if pieces intersect
        double slope = Math.abs(y2 - y1) / Math.abs(x2 - x1);
        if (x1 == x2 || y1 == y2 || slope == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

// failed test #6: 4 4 2 7

/*
Highlighted solution:

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            int num4 = scanner.nextInt();

            if (num1 == num3) {
                System.out.println("YES");
            } else if (num2 == num4) {
                System.out.println("YES");
            } else if (Math.abs(num1 - num3) == Math.abs(num2 - num4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

Looks like each condition where a queen could "touch" is
evaluated as a separate conditional.  Also, the way the
slope is evaluated avoids the need for division.  I had to
switch to doubles because integer division was causing some
false positives when results would round to 1.

 */