package assignment01_operators1;
public class RelationalOperatorsJNG {
    public static void main (String[] args) {
        // declare and initialize two integers.
        int x = 5;
        int y = 20;

        // perform and print relational comparisons.
        System.out.println(x + " == " + y + ": " + (x == y));
        System.out.println(x + " != " + y + ": " + (x != y));
        System.out.println(x + " >  " + y + ": " + (x > y));
        System.out.println(x + " <  " + y + ": " + (x < y));
        System.out.println(x + " >= " + y + ": " + (x >= y));
        System.out.println(x + " <= " + y + ": " + (x <= y));

        // checks if x falls within 10 to 50 range. displays message if its within the range or not.
        if (x >= 10 && x <= 50) {
            System.out.println(x + " is within the range 10 to 50.");
        } else {
            System.out.println(x + " is outside the range of 10 to 50.");
        }
    }
}