package Array;

import java.util.Scanner;

public class CommonArray {

    public static void main(String[] args) {

        System.out.println("Common Elements");

        Scanner b = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = b.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter first array elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = b.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = b.nextInt();

        int[] c = new int[n2];

        System.out.println("Enter second array elements:");

        for (int i = 0; i < c.length; i++) {
            c[i] = b.nextInt();
        }

        System.out.println("Common Elements:");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < c.length; j++) {

                if (a[i] == c[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }

        b.close();
    }
}