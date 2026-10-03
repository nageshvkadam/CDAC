package DSA;

import java.util.ArrayList;
import java.util.Collections;

public class Max {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(30);

        System.out.println("Numbers: " + numbers);

        int maxNumber = Collections.max(numbers);

        System.out.println("Maximum Number: " + maxNumber);
    }
}

