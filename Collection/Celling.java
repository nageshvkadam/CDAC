package Collection;

import java.util.TreeSet;

public class Celling {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int value = 25;

        System.out.println("TreeSet: " + numbers);
        System.out.println("Given Element: " + value);
        System.out.println("Ceiling Element: " + numbers.ceiling(value));
    }
}
