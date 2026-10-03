package Adavancejava;

@FunctionalInterface
interface Student {
    void study();
}

public class Lambda {

    public static void main(String[] args) {

        Student s = () -> {
            System.out.println("Student is studying");
        };

        s.study();
    }
}