import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String phrase = input.nextLine();

        System.out.println(phrase.replace("a", "b"));
    }
}