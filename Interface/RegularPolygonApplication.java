package Interface;

public class RegularPolygonApplication {

    public static void main(String[] args) {

        EquilateralTriangle triangle = new EquilateralTriangle(5);
        Square square = new Square(4);

        RegularPolygon[] polygons = {triangle, square};

        System.out.println("Triangle Sides: " + triangle.getNumSides());
        System.out.println("Triangle Side Length: " + triangle.getSideLength());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
        System.out.println("Triangle Interior Angle: " + triangle.getInteriorAngle());

        System.out.println();

        System.out.println("Square Sides: " + square.getNumSides());
        System.out.println("Square Side Length: " + square.getSideLength());
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Interior Angle: " + square.getInteriorAngle());

        System.out.println();

        System.out.println("Total Sides: " + RegularPolygon.totalSides(polygons));
    }
}