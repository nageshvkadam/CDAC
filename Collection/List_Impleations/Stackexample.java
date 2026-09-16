package List_Impleations;
import java.util.Stack;

public class Stackexample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        System.out.println("After pop: " + stack);

        System.out.println("Search 10: " + stack.search(10));

        System.out.println("Is Empty: " + stack.empty());
    }
}