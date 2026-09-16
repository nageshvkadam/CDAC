package Collection;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("List: " + list);

        list.add(1, 15);
        System.out.println("After add index: " + list);

        System.out.println("Get index 2: " + list.get(2));

        list.set(2, 25);
        System.out.println("After set: " + list);

        list.remove(1);
        System.out.println("After remove: " + list);

        System.out.println("Contains 25? " + list.contains(25));

        System.out.println("Size: " + list.size());

        for (Integer i : list) {
            System.out.println(i);
        }

        list.clear();
        System.out.println("After clear: " + list);
    }
}