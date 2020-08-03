import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // capture input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        // reset the case
        input = input.toLowerCase();

        // print the result
        // System.out.println(input.startsWith("j")); // solution prefers .charAt(0) instead.
        System.out.println('j' == input.charAt(0));
    }
}