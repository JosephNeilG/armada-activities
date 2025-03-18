package assignmentoperators1;
public class ModulusOperatorJNG {
    public static void main(String[] args) {
        // declare and initialize two numbers.
        int num1 = 10;
        int num2 = 3;

        // calculate the remainder of the division.
        int remainder = num1 % num2;
        
        // display the remainder result.
        System.out.println(num1 + " divided by " + num2 + " gives a remainder of: " + remainder);

        // check if num1 is divisible by num2.
        if(num1 % num2 == 0) {
            System.out.println(num1 + " is divisible by " + num2 +".");
        } else {
            System.out.println(num1 + " is not divisible by " + num2 +".");

        }
    }
}