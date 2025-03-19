package assignment05_loops;
public class MultiplicationTableJNG {
    public static void main(String[] args) {
        int num = 5;

        // Loops from 1-10 to print multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}