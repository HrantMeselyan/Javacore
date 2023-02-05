package group1.Chapter8.FindAreas;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("in the area of the quadrilateral");
        return dim1 * dim2;
    }
}
