package Array;

import java.util.Scanner;

public class Sumarray {

    public static void main(String[] args) {

        System.out.println("Sum of Array");

        Scanner b = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = b.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = b.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of Array: " + sum);

        b.close();
    }
}