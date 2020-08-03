import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // capture inputs
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

//        // determine if one is positive
//        boolean result =
//                (n1 > 0 && (n2 <= 0 || n3 <= 0)) ||
//                        (n2 > 0 && (n1 <= 0 || n3 <= 0)) ||
//                        (n3 > 0 && (n1 <= 0 || n2 <= 0));

        // struggling with this one, can solve with conditional processing
        int positives = 0;
        if (n1 > 0) {
            positives += 1;
        }
        if (n2 > 0) {
            positives += 1;
        }
        if (n3 > 0) {
            positives += 1;
        }

        boolean result;

        result = positives == 1;

        // print result
        System.out.println(result);
    }
}

/*
Reviewing solution on website.  Selected solution appears as:
    import java.util.Scanner;

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();

            boolean onlyFirstIsPositive = n1 > 0 && n2 <= 0 && n3 <= 0;
            boolean onlySecondIsPositive = n1 <= 0 && n2 > 0 && n3 <= 0;
            boolean onlyThirdIsPositive = n1 <= 0 && n2 <= 0 && n3 > 0;

            boolean exactlyOneIsPositive =
                onlyFirstIsPositive ||
                onlySecondIsPositive ||
                onlyThirdIsPositive;

            System.out.println(exactlyOneIsPositive);
        }
    }

 I wasn't too far off with my idea of checking each permutation if only
 one of the inputs is greater than zero.  Looking back at my code, there's something
 wrong with how I typed out the logic.
 */