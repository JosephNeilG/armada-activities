package assignment01_operators1;
public class ArithmeticOperatorsJNG {
    public static void main (String[] args) {
        // declaration and initialization.
        float num1 = 10.5F;
        float num2 = 5.00F;

        // perform arithmetic operations and store results in variables.
        float sum = num1 + num2;
        float difference = num1 - num2;
        float product = num1 * num2;
        float quotient = num1 / num2;
        
        // display results.
        System.out.println("Addition: " + num1 + " + " + num2 + " = "+ sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = "+ difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = "+ product);
        System.out.println("Division: " + num1 + " / " + num2 + " = "+ quotient);
    }
}