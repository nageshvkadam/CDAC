package List_Impleations;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.addFirst("HTML");
        list.addLast("Spring");

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println("After remove: " + list);

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        System.out.println("Contains Java? " + list.contains("Java"));

        System.out.println("Size: " + list.size());
    }
}