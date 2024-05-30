package week14;

public class BinaryTree01 {
    Node01 root;

    public BinaryTree01() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    boolean find(int data) {
        boolean hasil = false;
        Node01 current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node01 node) {
        if (node != null) {
            System.out.println(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node01 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(" " + node.data);
        }
    }

    void traverseInOrder(Node01 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node01 getSuccessor(Node01 del) {
        Node01 successor = del.right;
        Node01 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successorParent != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        // find node (current) that will be deleted
        Node01 parent = root;
        Node01 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {// if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {// if there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node01 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    void addRecursive(Node01 currentNode, int data) {
        if (data < currentNode.data) {
            if (currentNode.left != null) {
                addRecursive(currentNode.left, data);
            } else {
                currentNode.left = new Node01(data);
            }
        } else if (data > currentNode.data) {
            if (currentNode.right != null) {
                addRecursive(currentNode.right, data);
            } else {
                currentNode.right = new Node01(data);
            }
        }
    }

    void add(int data) {
        if (isEmpty()) {// tree is empty
            root = new Node01(data);
        } else {
            addRecursive(root, data);
        }
    }

    public void displayMinMaxValues() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        Node01 current = root;
        while (current.left != null) {
            current = current.left;
        }

        System.out.println("Smallest value: " + current.data);

        current = root;
        while (current.right != null) {
            current = current.right;
        }

        System.out.println("Largest value: " + current.data);
    }

    public void displayLeafNodes() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        displayLeafNodes(root);
    }

    private void displayLeafNodes(Node01 node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            System.out.println("Leaf node: " + node.data);
        }

        displayLeafNodes(node.left);
        displayLeafNodes(node.right);
    }

    public int countLeaves() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return 0;
        }

        return countLeaves(root);
    }

    private int countLeaves(Node01 node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        int leftLeaves = countLeaves(node.left);
        int rightLeaves = countLeaves(node.right);

        return leftLeaves + rightLeaves;
    }
}