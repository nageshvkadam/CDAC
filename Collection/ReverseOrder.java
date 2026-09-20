package Collection;

import java.util.TreeSet;

public class ReverseOrder {
    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<String>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("Original TreeSet: " + colors);
        System.out.println("Reverse Order: " + colors.descendingSet());
    }
}