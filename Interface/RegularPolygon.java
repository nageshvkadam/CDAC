package
 Interface;

public interface RegularPolygon {

    int getNumSides();

    double getSideLength();

    default double getPerimeter() {
        return getNumSides() * getSideLength();
    }

    default double getInteriorAngle() {
        int n = getNumSides();
        return ((n - 2) * Math.PI) / n;
    }

    static int totalSides(RegularPolygon[] polygons) {
        int total = 0;

        for (RegularPolygon polygon : polygons) {
            total = total + polygon.getNumSides();
        }

        return total;
    }
}