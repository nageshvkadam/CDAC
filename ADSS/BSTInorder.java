package ADSS;

import java.util.Scanner;

public class BSTInorder {

    static class Node {
        int key;
        Node left;
        Node right;

        Node(int k) {
            key = k;
        }
    }

    static Node insert(Node root, int key) {

        if (root == null) {
            return new Node(key);
        }

        if (key < root.key) {
            root.left = insert(root.left, key);
        }
        else if (key > root.key) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.key + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");

        int n = sc.nextInt();

        Node root = null;

        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            root = insert(root, key);
        }

        System.out.print("Inorder: ");

        if (root == null) {
            System.out.println("Empty.");
        }
        else {
            inorder(root);
            System.out.println();
        }

        sc.close();
    }
}