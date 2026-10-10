
import java.util.Scanner;

public class ArrayScenario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int i = 0;

        // 1. Insertion
        System.out.println("Enter marks of 5 students:");

        while (i < marks.length) {
            marks[i] = sc.nextInt();
            i++;
        }

        // 2. Traversal / Display
        System.out.println("Student Marks:");
        i = 0;

        while (i < marks.length) {
            System.out.println(marks[i]);
            i++;
        }

        // 3. Searching
        System.out.print("Enter mark to search: ");
        int key = sc.nextInt();
        int found = -1;
        i = 0;

        while (i < marks.length) {
            if (marks[i] == key) {
                found = i;
                break;
            }
            i++;
        }

        if (found != -1) {
            System.out.println("Mark found at index " + found);
        } else {
            System.out.println("Mark not found");
        }

        // 4. Updating
        System.out.print("Enter index to update (0-4): ");
        int index = sc.nextInt();

        if (index >= 0 && index < marks.length) {
            System.out.print("Enter new mark: ");
            marks[index] = sc.nextInt();
        } else {
            System.out.println("Invalid index");
        }

        // 5. Deletion (shift elements left)
        System.out.print("Enter index to delete (0-4): ");
        int del = sc.nextInt();

        if (del >= 0 && del < marks.length) {
            i = del;

            while (i < marks.length - 1) {
                marks[i] = marks[i + 1];
                i++;
            }

            marks[marks.length - 1] = 0;
        } else {
            System.out.println("Invalid index");
        }

        // Display after update and deletion
        System.out.println("Array after operations:");
        i = 0;

        while (i < marks.length) {
            System.out.println(marks[i]);
            i++;
        }

        // 6. Find maximum
        int max = marks[0];
        i = 1;

        while (i < marks.length) {
            if (marks[i] > max) {
                max = marks[i];
            }
            i++;
        }

        System.out.println("Maximum mark: " + max);

        sc.close();
    }
}
