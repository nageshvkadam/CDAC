package List_Impleations;   
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(5);
        v.add(10);
        v.add(15);

        System.out.println("Vector: " + v);

        v.addElement(20);

        System.out.println("After addElement: " + v);

        System.out.println("Element at index 1: " + v.get(1));

        v.remove(2);
        System.out.println("After remove: " + v);

        System.out.println("Capacity: " + v.capacity());

        System.out.println("Size: " + v.size());
    }
}