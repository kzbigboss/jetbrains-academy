import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entries = scanner.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        for (int i = 0; i < entries; i++) {
            int input = scanner.nextInt();

            if (input == 5) {
                gradeA += 1;
            } else if (input == 4) {
                gradeB += 1;
            } else if (input == 3) {
                gradeC += 1;
            } else if (input == 2) {
                gradeD += 1;
            }
        }

        System.out.print(gradeD + " ");
        System.out.print(gradeC + " ");
        System.out.print(gradeB + " ");
        System.out.print(gradeA);
    }
}