
import java.util.Random;

public class MergeSort {

    static long comparisons = 0;
    static long copies = 0;

    // Merge Sort Algorithm
    public static void mergeSort(int[] arr,
                                 int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            // Divide into two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted halves
    public static void merge(int[] arr,
                             int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy elements into temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
            copies++;
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
            copies++;
        }

        int i = 0, j = 0, k = left;

        // Compare and merge elements
        while (i < n1 && j < n2) {

            comparisons++;

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }

            copies++;
            k++;
        }

        // Copy remaining left elements
        while (i < n1) {
            arr[k] = L[i];
            copies++;
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j < n2) {
            arr[k] = R[j];
            copies++;
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int n = 1000;
        int[] arr = new int[n];

        Random rand = new Random();

        // Generate 1000 random numbers
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000);
        }

        // Start time
        long startTime = System.nanoTime();

        // Call Merge Sort
        mergeSort(arr, 0, n - 1);

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
        System.out.println("Element Copies: " + copies);

        System.out.println("Execution Time: "
                           + executionTime + " ms");

        System.out.println("\nTime Complexity:");
        System.out.println("Best Case: O(n log n)");
        System.out.println("Average Case: O(n log n)");
        System.out.println("Worst Case: O(n log n)");
        System.out.println("Space Complexity: O(n)");
    }
}
