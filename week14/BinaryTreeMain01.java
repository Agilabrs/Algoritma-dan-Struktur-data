package week14;

import java.util.Scanner;

public class BinaryTreeMain01 {
    public static void main(String[] args) {
        BinaryTree01 binaryTree = new BinaryTree01();
        Scanner scanner = new Scanner(System.in);
        char choice;
        int data;
        do {
            System.out.println("Binary Tree Menu:");
            System.out.println("a. Add");
            System.out.println("b. Delete");
            System.out.println("c. Find");
            System.out.println("d. Traverse inOrder");
            System.out.println("e. Traverse preOrder");
            System.out.println("f. Traverse postOrder");
            System.out.println("g. Display Values");
            System.out.println("h. Display Leaf Node");
            System.out.println("i. Count Leaves");
            System.out.println("j. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.print("Enter the data to add: ");
                    data = scanner.nextInt();
                    binaryTree.add(data);
                    break;
                case 'b':
                    System.out.print("Enter the data to delete: ");
                    data = scanner.nextInt();
                    binaryTree.delete(data);
                    break;
                case 'c':
                    System.out.print("Enter the data to find: ");
                    data = scanner.nextInt();
                    if (binaryTree.find(data)) {
                        System.out.println("Data found in the tree.");
                    } else {
                        System.out.println("Data not found in the tree.");
                    }
                    break;
                case 'd':
                    System.out.println("Traversing in inOrder:");
                    binaryTree.traverseInOrder(binaryTree.root);
                    break;
                case 'e':
                    System.out.println("Traversing in preOrder:");
                    binaryTree.traversePreOrder(binaryTree.root);
                    break;
                case 'f':
                    System.out.println("Traversing in postOrder:");
                    binaryTree.traversePostOrder(binaryTree.root);
                    break;
                case 'g':
                    System.out.println("Display Values : ");
                    binaryTree.displayMinMaxValues();
                    break;
                case 'h':
                    System.out.println("Display Leaf Node : ");
                    binaryTree.displayLeafNodes();
                    break;
                case 'i':
                    System.out.println("Counting Leaves : ");
                    binaryTree.countLeaves();
                    break;
                case 'j':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 'j');
        scanner.close();
    }
}
