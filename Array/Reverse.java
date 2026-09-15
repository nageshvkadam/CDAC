package Array;

public class Reverse {

    public static void main(String[] args) {

        System.out.println("Reverse A Array");

        int a[] = {1, 23, 13, 1, 78, 132, 7, 1, 321, 2};

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}