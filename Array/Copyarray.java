package Array;

import java.util.Scanner;

public class Copyarray {

    public static void main(String[] args) {

        System.out.println("Copy Array");

        Scanner b = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = b.nextInt();

        int[] arr = new int[n];
        int[] copy = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = b.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        System.out.println("Copied Array:");

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }

        b.close();
    }
}