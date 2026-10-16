
import java.util.Random;

public class SelectionSort {
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

        // Selection Sort Algorithm
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
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
        System.out.println("Best Case: O(n^2)");
        System.out.println("Average Case: O(n^2)");
        System.out.println("Worst Case: O(n^2)");
        System.out.println("Space Complexity: O(1)");
    }
}
