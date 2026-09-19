package Collection;

 import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        colors.remove(2);

        System.out.println(colors);
    }
}
