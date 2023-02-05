package group1.Chapter8.AbstractArea;


public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("in the area of triangle");
        return dim1 * dim2 / 2;
    }
}
