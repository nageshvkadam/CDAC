package Collection;
import  java.util.*;
public class Retrieve {
    
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        String color = colors.get(2);

        System.out.println("Element at index 2: " + color);
    }
}

