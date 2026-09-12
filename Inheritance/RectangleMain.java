package Inheritance;

class Rectangle {


    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    void perimeter() {
        System.out.println("Rectangle Perimeter: " + (2 * (length + breadth)));
    }
}

class Square extends Rectangle {

    Square(int side) {
        super(side, side);
    }
}

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 4);

        r.area();
        r.perimeter();

        Square s = new Square(5);

        s.area();
        s.perimeter();
    }
}