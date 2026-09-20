package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("Before Reverse: " + colors);

        Collections.reverse(colors);

        System.out.println("After Reverse: " + colors);
    }
}
