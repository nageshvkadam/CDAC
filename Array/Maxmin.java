package Array;

import java.util.Scanner;

public class Maxmin {

    public static void main(String[] args) {

        System.out.println("Maximum and Minimum Value");

        Scanner b = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = b.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = b.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);

        b.close();
    }
}