import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        String search = "Green";

        if (colors.contains(search)) {
            System.out.println(search + " is present in the ArrayList");
        } else {
            System.out.println(search + " is not present in the ArrayList");
        }
    }
}