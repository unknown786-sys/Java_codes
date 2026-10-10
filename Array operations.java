import java.util.Scanner;

public class ArrayOperations {

    // Fixed maximum size of the array
    static final int MAX_SIZE = 10;

    // Array and current size
    static int[] arr = new int[MAX_SIZE];
    static int size = 0;

    // Scanner for user input
    static Scanner input = new Scanner(System.in);

    // 1. Add a new value at the end
    static void addValue() {

        if (size == MAX_SIZE) {
            System.out.println("Array is full. Cannot add more values.");
            return;
        }

        System.out.print("Enter value: ");
        int value = input.nextInt();

        arr[size] = value;
        size++;

        System.out.println("Value added successfully.");
    }

    // 2. Insert a value at a specific index
    static void insertAtIndex() {

        if (size == MAX_SIZE) {
            System.out.println("Array is full. Cannot insert more values.");
            return;
        }

        System.out.print("Enter index (0 to " + size + "): ");
        int index = input.nextInt();

        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.print("Enter value: ");
        int value = input.nextInt();

        // Shift elements to the right
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        size++;

        System.out.println("Value inserted successfully.");
    }

    // 3. Fill the array with multiple values
    static void fillArray() {

        if (size == MAX_SIZE) {
            System.out.println("Array is already full.");
            return;
        }

        System.out.println("Enter values one by one.");
        System.out.println("Enter -1 to stop.");

        while (size < MAX_SIZE) {

            System.out.print("Enter value: ");
            int value = input.nextInt();

            if (value == -1) {
                break;
            }

            arr[size] = value;
            size++;
        }

        if (size == MAX_SIZE) {
            System.out.println("Array is now full.");
        }

        System.out.println("Array filling completed.");
    }

    // 4. Delete the last element
    static void deleteLastElement() {

        if (size == 0) {
            System.out.println("Array is empty. Nothing to delete.");
            return;
        }

        size--;

        System.out.println("Last element deleted successfully.");
    }

    // 5. Delete by index
    static void deleteByIndex() {

        if (size == 0) {
            System.out.println("Array is empty. Nothing to delete.");
            return;
        }

        System.out.print("Enter index to delete (0 to " + (size - 1) + "): ");
        int index = input.nextInt();

        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }

        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("Element deleted successfully.");
    }

    // 6. Display all elements
    static void display() {

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Array elements: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // 7. Search for a value
    static void searchValue() {

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Enter value to search: ");
        int value = input.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (arr[i] == value) {
                System.out.println("Value found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Value not found.");
        }
    }

    // 8. Get value at a specific index
    static void getValueAtIndex() {

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Enter index (0 to " + (size - 1) + "): ");
        int index = input.nextInt();

        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.println("Value at index " + index + " is: " + arr[index]);
    }

    // 9. Replace / Update value at an index
    static void updateValue() {

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Enter index to update (0 to " + (size - 1) + "): ");
        int index = input.nextInt();

        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.print("Enter new value: ");
        int newValue = input.nextInt();

        arr[index] = newValue;

        System.out.println("Value updated successfully.");
    }

    // 10. Show current size
    static void showSize() {

        System.out.println("Current number of elements: " + size);
    }

    // Main method
    public static void main(String[] args) {

        int choice;

        do {

            System.out.println();
            System.out.println("----- ARRAY MENU -----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display");
            System.out.println("7. Search value");
            System.out.println("8. Get value at index");
            System.out.println("9. Replace/Update value at index");
            System.out.println("10. Size");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    addValue();
                    break;

                case 2:
                    insertAtIndex();
                    break;

                case 3:
                    fillArray();
                    break;

                case 4:
                    deleteLastElement();
                    break;

                case 5:
                    deleteByIndex();
                    break;

                case 6:
                    display();
                    break;

                case 7:
                    searchValue();
                    break;

                case 8:
                    getValueAtIndex();
                    break;

                case 9:
                    updateValue();
                    break;

                case 10:
                    showSize();
                    break;

                case 11:
                    System.out.println("Program exited successfully.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 11);

        input.close();
    }
}