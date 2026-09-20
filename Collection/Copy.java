package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Copy {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        ArrayList<String> newColors = new ArrayList<String>(colors.size());

        for (int i = 0; i < colors.size(); i++) {
            newColors.add("");
        }

        Collections.copy(newColors, colors);

        System.out.println("Original ArrayList: " + colors);
        System.out.println("Copied ArrayList: " + newColors);
    }
}