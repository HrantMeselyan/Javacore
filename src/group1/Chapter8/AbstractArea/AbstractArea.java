package group1.Chapter8.AbstractArea;

public class AbstractArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Area = " + figref.area());
        figref = t;
        System.out.println("Area = " + figref.area());

    }
}
