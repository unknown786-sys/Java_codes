
import java.util.Random;

public class MergeSort {

    static long comparisons = 0;

    // Merge Sort
    public static void mergeSort(int[] arr,
                                 int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

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

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            comparisons++;

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void main(String[] args) {

        int n = 1000;
        int[] arr = new int[n];
        Random rand = new Random();

        // Generate random numbers
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000);
        }

        // Start time
        long startTime = System.nanoTime();

        // Call Merge Sort
        mergeSort(arr, 0, n - 1);

        // End time
        long endTime = System.nanoTime();

        double executionTime =
            (endTime - startTime) / 1000000.0;

        System.out.println("Merge Sort");
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

        System.out.println("Best Case: O(n log n)");
        System.out.println("Average Case: O(n log n)");
        System.out.println("Worst Case: O(n log n)");
    }
}
