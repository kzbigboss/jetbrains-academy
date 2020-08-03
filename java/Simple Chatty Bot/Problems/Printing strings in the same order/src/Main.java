import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // collect words
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();

        // print three words
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
    }
}