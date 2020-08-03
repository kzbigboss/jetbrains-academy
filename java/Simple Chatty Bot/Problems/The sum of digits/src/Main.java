import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // capture number between 100 & 999
        int input = scanner.nextInt();

// keeping this validation part reduce the string of this answer; annoying
//        // validate input
//        if (input > 999 || input < 100){
//            System.out.println("Try again with a number between 100 & 999.");
//            return;
//        }

        // parse digits
        int first = input / 100;
        int second = (input % 100) / 10;
        int third = input % 10;
        int result = first + second + third;

        // print result
        System.out.println(result);
    }
}