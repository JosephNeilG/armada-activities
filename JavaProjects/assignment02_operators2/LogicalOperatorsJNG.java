package assignment02_operators2;
public class LogicalOperatorsJNG {
    public static void main(String[] args) {
        // Declare and initialize boolean variables
        boolean a = true;
        boolean b = false;

        // Logical AND operation (both must be true)
        if (a && b) {
            System.out.println("a && b: True");
        } else {
            System.out.println("a && b: False");
        }

        // Logical OR operation (at least one must be true)
        if (a || b) {
            System.out.println("a || b: True");
        } else {
            System.out.println("a || b: False");
        }

        // Logical NOT operation (negates the boolean value)
        System.out.println("!a is: " + !a);
        System.out.println("!b is: " + !b);

        // Constants for loan eligibility criteria
        final int MIN_CREDIT_SCORE = 700;
        final int MIN_ANNUAL_INCOME = 50000;

        // Values to check for loan eligibility
        int creditScoreInput = 200;
        int annualIncomeInput = 60000;

        // Check if user meets loan eligibility criteria
        if (creditScoreInput > MIN_CREDIT_SCORE && annualIncomeInput > MIN_ANNUAL_INCOME) {
            System.out.println("Your credit score is " + creditScoreInput + " and annual income of " + annualIncomeInput + ". You are eligible for a loan.");
        } else {
            System.out.println("Your credit score is " + creditScoreInput + " and annual income of " + annualIncomeInput + ". You are not eligible for a loan.");
        }
    }
}