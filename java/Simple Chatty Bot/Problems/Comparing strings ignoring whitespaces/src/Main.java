import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // capture from keyboard
        Scanner scanner = new Scanner(System.in);

        // capture words
        String one = scanner.nextLine();
        String two = scanner.nextLine();

        // remove withspaces
        one = one.replace(" ", "");
        two = two.replace(" ", "");

        // print result
        System.out.println(one.equals(two));
    }
}