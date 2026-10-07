package ADSS;

import java.util.Scanner;

public class LinkedListDuplicates {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    static boolean alreadyPrinted(Node head, Node current) {
        Node temp = head;

        while (temp != current) {
            if (temp.data == current.data) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    static void printDuplicates(Node head) {

        boolean found = false;

        Node current = head;

        while (current != null) {

            if (!alreadyPrinted(head, current)) {

                int count = 0;
                Node temp = head;

                while (temp != null) {
                    if (temp.data == current.data) {
                        count++;
                    }
                    temp = temp.next;
                }

                if (count > 1) {
                    if (!found) {
                        System.out.println("Duplicates:");
                        found = true;
                    }

                    System.out.println(current.data + " (" + count + " times)");
                }
            }

            current = current.next;
        }

        if (!found) {
            System.out.println("No duplicates");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = insert(head, value);
        }

        printDuplicates(head);

        sc.close();
    }
}