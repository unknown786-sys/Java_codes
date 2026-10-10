import java.util.Scanner;

public class QueueOperations {

    // Maximum capacity of queue
    static final int MAX_SIZE = 10;

    // Array for queue
    static int[] queue = new int[MAX_SIZE];

    // Front and rear variables
    static int front = 0;
    static int rear = -1;

    // Number of elements
    static int count = 0;

    // Scanner for input
    static Scanner input = new Scanner(System.in);

    // 1. Enqueue
    static void enqueue() {

        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue more values.");
            return;
        }

        System.out.print("Enter value to enqueue: ");
        int value = input.nextInt();

        // Circular queue
        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = value;
        count++;

        System.out.println("Value enqueued successfully.");
    }

    // 2. Dequeue
    static void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }

        int value = queue[front];

        front = (front + 1) % MAX_SIZE;
        count--;

        System.out.println("Dequeued value: " + value);
    }

    // 3. Display
    static void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");

        for (int i = 0; i < count; i++) {
            int index = (front + i) % MAX_SIZE;
            System.out.print(queue[index] + " ");
        }

        System.out.println();
    }

    // 4. Size
    static void size() {

        System.out.println("Current number of elements: " + count);
    }

    // 5. isEmpty
    static boolean isEmpty() {

        return count == 0;
    }

    // 6. isFull
    static boolean isFull() {

        return count == MAX_SIZE;
    }

    // Main method
    public static void main(String[] args) {

        int choice;

        do {
            System.out.println();
            System.out.println("----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    enqueue();
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    size();
                    break;

                case 5:
                    if (isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;

                case 6:
                    if (isFull()) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.println("Queue is not full.");
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