package assignmentoperators2;
public class CombinedOperatorsJNG {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        /**
         * If both a and b are positive
         * - perform addition and multiplication operations
         * - display the final result
         */
        if (a > 0 && b > 0) {
            a += b;
            b = a * 2;

            System.out.println("Final value of a: " + a);
            System.out.println("Final value of b: " + b);
        } else {
            // Display error message if either value is not positive.
            System.out.println("Invalid Input. Both values must be positive numbers.");
        }
    }
}
