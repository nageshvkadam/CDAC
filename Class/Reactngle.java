package Class;
class Rectangle {

    int length;
    int breadth;

    // Constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {

        // First Rectangle
        Rectangle r1 = new Rectangle(4, 5);

        // Second Rectangle
        Rectangle r2 = new Rectangle(5, 8);

        System.out.println("Area of First Rectangle: " + r1.area());
        System.out.println("Area of Second Rectangle: " + r2.area());
    }
}