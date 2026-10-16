
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        int n = 1000;
        int[] arr = new int[n];

        Random rand = new Random();

        // Generate 1000 random numbers
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000);
        }

        long comparisons = 0;
        long shifts = 0;

        // Start time
        long startTime = System.nanoTime();

        // Insertion Sort Algorithm
        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;

                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    shifts++;
                    j--;
                } else {
                    break;
                }
            }

            arr[j + 1] = key;
        }

        // End time
        long endTime = System.nanoTime();

        // Calculate execution time
        double executionTime =
            (endTime - startTime) / 1000000.0;

        // Display sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Display analysis
        System.out.println("\n\nArray Length: " + n);

        System.out.println("Comparisons: " + comparisons);
        System.out.println("Shifts: " + shifts);

        System.out.println("Execution Time: "
                           + executionTime + " ms");

        System.out.println("\nTime Complexity:");
        System.out.println("Best Case: O(n)");
        System.out.println("Average Case: O(n^2)");
        System.out.println("Worst Case: O(n^2)");
        System.out.println("Space Complexity: O(1)");
    }
}
