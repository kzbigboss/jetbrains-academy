import java.util.*;

public class Main {
    public static void main(String[] args) {
        // capture inputs
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();        // initial money deposit
        double p = scanner.nextDouble() / 100;  // growth rate
        double k = scanner.nextDouble();        // target money amount
        int years = 0;

        // loop until money (m) grows until it exceeds goal (k)
        while (m < k) {
            m = m * (1 + p);
            years++;
        }

        // report years until goal
        System.out.println(years);
    }
}