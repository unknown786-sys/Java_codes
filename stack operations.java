import java.util.Scanner;

public class StackOperations {

    // Maximum capacity of stack
    static final int MAX_SIZE = 10;

    // Array for stack
    static int[] stack = new int[MAX_SIZE];

    // Top variable
    static int top = -1;

    // Scanner for input
    static Scanner input = new Scanner(System.in);

    // 1. Push
    static void push() {

        if (isFull()) {
            System.out.println("Stack is full. Cannot push more values.");
            return;
        }

        System.out.print("Enter value to push: ");
        int value = input.nextInt();

        top++;
        stack[top] = value;

        System.out.println("Value pushed successfully.");
    }

    // 2. Pop
    static void pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }

        int value = stack[top];
        top--;

        System.out.println("Popped value: " + value);
    }

    // 3. Display
    static void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");

        // Display from top to bottom
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    // 4. Size
    static void size() {

        System.out.println("Current number of elements: " + (top + 1));
    }

    // 5. isEmpty
    static boolean isEmpty() {

        return top == -1;
    }

    // 6. isFull
    static boolean isFull() {

        return top == MAX_SIZE - 1;
    }

    // Main method
    public static void main(String[] args) {

        int choice;

        do {
            System.out.println();
            System.out.println("----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    push();
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    size();
                    break;

                case 5:
                    if (isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;

                case 6:
                    if (isFull()) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.println("Stack is not full.");
                    }
                    break;

                case 7:
                    System.out.println("Program exited successfully.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        input.close();
    }
}