import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long valFirst = scanner.nextLong();
        String operation = scanner.next();
        long valSecond = scanner.nextLong();


        switch (operation) {
            case "+":
                System.out.println(valFirst + valSecond);
                break;
            case "-":
                System.out.println(valFirst - valSecond);
                break;
            case "/":
                if (valSecond == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(valFirst / valSecond);
                }
                break;
            case "*":
                System.out.println(valFirst * valSecond);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}