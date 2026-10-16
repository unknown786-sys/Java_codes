
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        int n = 1000;
        int[] arr = new int[n];

        Random rand = new Random();

        // Generate 1000 random numbers
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000);
        }

        long comparisons = 0;
        long swaps = 0;

        // Start time
        long startTime = System.nanoTime();

        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            // Stop if array is already sorted
            if (!swapped) {
                break;
            }
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
        System.out.println("Swaps: " + swaps);

        System.out.println("Execution Time: "
                           + executionTime + " ms");

        System.out.println("\nTime Complexity:");
        System.out.println("Best Case: O(n)");
        System.out.println("Average Case: O(n^2)");
        System.out.println("Worst Case: O(n^2)");
        System.out.println("Space Complexity: O(1)");
    }
}
