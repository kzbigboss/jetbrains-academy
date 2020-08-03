import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // capture input
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // print squares until input is reached
        int i = 0;
        int squares = 0;

        while (squares <= input) {
            i++;
            squares = i * i;
            if (squares <= input) {
                System.out.println(squares);
            }
        }
    }
}