package a02_operators2;
public class AssignmentOperatorsJNG {
    public static void main(String[] args) {
        int x = 10;

        x += 5;
        System.out.println("x += 5 is: " + x);
        x -= 3;
        System.out.println("x -= 3 is: " + x);
        x *= 2;
        System.out.println("x *= 2 is: " + x);
        x /= 4;
        System.out.println("x /= 4 is: " + x);
        x %= 3;
        System.out.println("x %= 3 is: " + x);

        // Constants for discount and tax
        final double DISCOUNT = 0.80;
        final double TAX = 1.10;

        // Initial price before discount/ tax applied
        double initialPrice = 100.0;

        // Apply discount and tax
        initialPrice *= DISCOUNT;
        initialPrice *= TAX;

        // Print final price
        System.out.println("Final Price: $" + initialPrice);
    }
}
