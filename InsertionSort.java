
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        int n = 1000;
        int[] arr = new int[n];
        Random rand = new Random();

        // Generate random numbers
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000);
        }

        long comparisons = 0;

        // Start time
        long startTime = System.nanoTime();

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;

                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                } else {
                    break;
                }
            }

            arr[j + 1] = key;
        }

        // End time
        long endTime = System.nanoTime();

        double executionTime =
            (endTime - startTime) / 1000000.0;

        System.out.println("Insertion Sort");
        System.out.println("Array Length: " + n);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nComparisons: " + comparisons);
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
        System.out.println("Execution Time: "
                           + executionTime + " ms");

        System.out.println("Best Case: O(n)");
        System.out.println("Average Case: O(n^2)");
        System.out.println("Worst Case: O(n^2)");
    }
}
