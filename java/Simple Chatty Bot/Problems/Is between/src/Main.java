import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // capture int inputs
        int value = scanner.nextInt();
        int rangeStart = scanner.nextInt();
        int rangeEnd = scanner.nextInt();

        // check if value is between range, inclusive test
        boolean result =
                rangeStart <= value && value <= rangeEnd
                        ||
                        rangeEnd <= value && value <= rangeStart;

        // print result
        System.out.println(result);
    }
}