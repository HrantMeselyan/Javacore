package group1.Chapter6;

public class Box3 {
    double width;
    double height;
    double depth;

    Box3() {
        System.out.println("Constructor");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}
