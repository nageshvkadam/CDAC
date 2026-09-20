package Collection;

import java.util.TreeSet;

public class FirstLast {
    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<String>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("TreeSet: " + colors);
        System.out.println("First Element: " + colors.first());
        System.out.println("Last Element: " + colors.last());
    }
}
