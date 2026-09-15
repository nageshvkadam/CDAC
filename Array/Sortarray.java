package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sortarray {

    public static void main(String[] args) {

        System.out.println("Sort the Array");

        Scanner b = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = b.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = b.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        b.close();
    }
}