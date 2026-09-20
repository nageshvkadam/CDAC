package Collection;
import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("Before Shuffle: " + colors);

        Collections.shuffle(colors);

        System.out.println("After Shuffle: " + colors);
    }
}