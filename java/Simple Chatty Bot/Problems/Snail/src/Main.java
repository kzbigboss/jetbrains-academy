import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // collect input variables
        int height = scanner.nextInt();
        int dailyClimb = scanner.nextInt();
        int dailyFall = scanner.nextInt();

        // create tracking variables
        int progress = dailyClimb;
        int i = 1;

        // iterate until progress exceeds height
        while (height > progress) {
            i += 1;
            progress = progress + (dailyClimb - dailyFall);
        }

        // print result
        System.out.println(i);
    }
}