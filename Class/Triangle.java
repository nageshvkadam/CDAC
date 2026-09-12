package Class;
class Triangle {

    int side1;
    int side2;
    int side3;

    // Constructor
    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Calculate perimeter
    int perimeter() {
        return side1 + side2 + side3;
    }

    // Calculate area using Heron's formula
    double area() {
        double s = perimeter() / 2.0;

        return Math.sqrt(s * (s - side1) * 
                         (s - side2) * (s - side3));
    }

    public static void main(String[] args) {

        // Creating Triangle object
        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Area of Triangle: " + t.area());
        System.out.println("Perimeter of Triangle: " + t.perimeter());
    }
}