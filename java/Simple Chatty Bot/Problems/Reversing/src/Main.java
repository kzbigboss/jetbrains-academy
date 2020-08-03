import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // capture number between 100 & 999
        int input = scanner.nextInt();

        // parse digits
        int first = input / 100;
        int second = (input % 100) / 10;
        int third = input % 10;

        // reverse digits/positions
        int newFirst = third * 100;
        int newSecond = second * 10;
        int newThird = first;

        // create result
        int result = newFirst + newSecond + newThird;

        // print result
        System.out.println(result);
    }
}