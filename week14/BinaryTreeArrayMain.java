package week14;

import java.util.Scanner;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray01 bta = new BinaryTreeArray01();
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Tranversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
        /*
         * Scanner scanner = new Scanner(System.in);
         * char choice;
         * int data;
         * 
         * do {
         * System.out.println("Binary Tree Array Menu:");
         * System.out.println("a. Add");
         * System.out.println("b. Traverse inOrder");
         * System.out.println("c. Traverse preOrder");
         * System.out.println("d. Traverse postOrder");
         * System.out.println("e. Exit");
         * System.out.print("Enter your choice: ");
         * choice = scanner.next().charAt(0);
         * 
         * switch (choice) {
         * case 'a':
         * System.out.print("Enter the data to add: ");
         * data = scanner.nextInt();
         * bta.add(data);
         * break;
         * case 'b':
         * System.out.println("Traversing in inOrder:");
         * bta.traverseInOrder(0);
         * System.out.println();
         * break;
         * case 'c':
         * System.out.println("Traversing in preOrder:");
         * bta.traversePreOrder(0);
         * System.out.println();
         * break;
         * case 'd':
         * System.out.println("Traversing in postOrder:");
         * bta.traversePostOrder(0);
         * System.out.println();
         * break;
         * case 'e':
         * System.out.println("Exiting...");
         * break;
         * default:
         * System.out.println("Invalid choice. Please try again.");
         * }
         * System.out.println();
         * } while (choice != 'e');
         * 
         * scanner.close();
         */
    }
}
