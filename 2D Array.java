import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take rows and columns at runtime
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // Create 2D array
        int[][] array = new int[rows][columns];

        // Input elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextInt();
            }
        }

        // Display 2D array
        System.out.println("2D Array is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}