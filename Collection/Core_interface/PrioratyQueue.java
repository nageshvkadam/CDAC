package Collection.Core_interface;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioratyQueue {

    public static void main(String[] args) {

        // Create PriorityQueue
        Queue<Integer> pq = new PriorityQueue<>();

        // 1. add() - Add elements
        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        pq.add(30);

        System.out.println("PriorityQueue elements: " + pq);

        pq.offer(60);
        System.out.println("After offer(60): " + pq);

        System.out.println("Head element using peek(): " + pq.peek());

        System.out.println("Head element using element(): " + pq.element());

        System.out.println("Removed using poll(): " + pq.poll());
        System.out.println("After poll(): " + pq);

        pq.remove();
        System.out.println("After remove(): " + pq);

        System.out.println("Contains 40? " + pq.contains(40));

        System.out.println("Size of queue: " + pq.size());

        System.out.println("Is queue empty? " + pq.isEmpty());

        System.out.println("Elements using loop:");
        for (Integer i : pq) {
            System.out.println(i);
        }

        // 11. clear() - Remove all elements
        pq.clear();
        System.out.println("After clear(): " + pq);

        // 12. isEmpty() after clear
        System.out.println("Is queue empty now? " + pq.isEmpty());
    }
}