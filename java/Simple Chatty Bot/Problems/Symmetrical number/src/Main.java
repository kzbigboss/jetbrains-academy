import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int d1 = input / 1000;
        int d2 = (input / 100) % 10;
        int d3 = (input / 10) % 10;
        int d4 = input % 10;

        if (d2 * 10 + d1 == d3 * 10 + d4) { // post-review: don't need to add the values, could check positional values instead: d1 == d4 && d2 == d3
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}