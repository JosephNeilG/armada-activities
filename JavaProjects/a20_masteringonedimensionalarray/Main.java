package a20_masteringonedimensionalarray;

/** Calculates the sum and average of a one-dimensional integer array. */
public class Main {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numArr = {5, 10, 15, 20, 25};

        // Variable to store the sum of elements
        int sum = 0;

        // Loop through the array and calculate sum
        for (int num : numArr) {
            sum += num;
        }

        // Calculate the average (Type casted sum to double)
        double average = (double) sum / numArr.length;

        // Display results
        System.out.println("Sum of elements: " + sum);
        System.out.printf("Average of elements: %.1f%n", average);
    }
}