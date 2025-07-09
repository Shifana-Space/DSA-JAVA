public class Main {

    // This is the node of our tree
    static class Node {
        int data;
        Node left, right;

        // Constructor to set data
        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Method to insert values into the BST
    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value); // create new node if tree is empty
        }

        if (value < root.data) {
            root.left = insert(root.left, value); // insert in left subtree
        } else {
            root.right = insert(root.right, value); // insert in right subtree
        }

        return root;
    }

    // Method to search a value in BST
    public static boolean search(Node root, int key) {
        if (root == null) return false; // not found
        if (root.data == key) return true; // found

        // search in left or right subtree
        if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    // Method to find minimum value in BST
    public static int findMin(Node root) {
        while (root.left != null) {
            root = root.left; // keep going left
        }
        return root.data;
    }

    // Method to find maximum value in BST
    public static int findMax(Node root) {
        while (root.right != null) {
            root = root.right; // keep going right
        }
        return root.data;
    }

    // Main method (entry point)
    public static void main(String[] args) {
        Node root = null;

        // Insert values into the tree
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 70);
        insert(root, 20);
        insert(root, 40);
        insert(root, 60);
        insert(root, 80);

        // Search some values
        System.out.println("Is 40 in the tree? " + search(root, 40)); // true
        System.out.println("Is 100 in the tree? " + search(root, 100)); // false

        // Find and print min and max
        System.out.println("Minimum value: " + findMin(root)); // 20
        System.out.println("Maximum value: " + findMax(root)); // 80
    }
}