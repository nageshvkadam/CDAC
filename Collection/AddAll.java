package Collection;

import java.util.TreeSet;

public class AddAll {
    public static void main(String[] args) {

        TreeSet<String> colors1 = new TreeSet<String>();

        colors1.add("Red");
        colors1.add("Blue");
        colors1.add("Green");

        TreeSet<String> colors2 = new TreeSet<String>();

        colors2.add("Yellow");
        colors2.add("Black");

        colors1.addAll(colors2);

        System.out.println("TreeSet 1: " + colors1);
        System.out.println("TreeSet 2: " + colors2);
    }
}