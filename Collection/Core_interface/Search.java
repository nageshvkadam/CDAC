package Collection.Core_interface;

public class Search {
    public static void main(String[] args) {
        System.out.println("Search the Element ");
        int a[] = {1, 23, 132, 1, 32, 13, 2131, 3};

        int element = 23;
        boolean found = false;

        // Apply for loop
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}