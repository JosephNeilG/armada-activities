package a28_optimizingstringprocessingforlargedata;

public class Main {
    public static void main(String[] args) {
        int iterations = 100_000; // Number of iterations to append "Java"

        // Measure time for String
        long startTime = System.nanoTime();
        String str = "";

        for (int i = 0; i < iterations; i++) {
            str += "Java";
        }

        long endTime = System.nanoTime();
        long stringTime = (endTime - startTime) / 1000000; // Calculate time taken

        System.out.println("Appending 100,000 times using String took: " + stringTime  + "ms");

        // Measure time for StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            sb.append("Java");
        }

        endTime = System.nanoTime();
        long stringBuilderTime = (endTime - startTime) / 1000000; // Calculate time taken

        System.out.println("Appending 100,000 times using StringBuilder took: " + stringBuilderTime + "ms");

        // Measure time for StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();

        for (int i = 0; i < iterations; i++) {
            sbf.append("Java");
        }

        endTime = System.nanoTime();
        long stringBufferTime = (endTime - startTime) / 1000000; // Calculate time taken

        System.out.println("Appending 100,000 times using StringBuffer took: " + stringBufferTime + "ms");

        // Compare results and prints most efficient method
        if (stringBuilderTime < stringBufferTime && stringBuilderTime < stringTime) {
            System.out.println("Fastest method: StringBuilder");
        } else if (stringBufferTime < stringBuilderTime && stringBufferTime < stringTime) {
            System.out.println("Fastest method: StringBuffer");
        } else {
            System.out.println("Fastest method: String");
        }
    }
}