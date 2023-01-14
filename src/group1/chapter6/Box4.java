package group1.chapter6;

public class Box4 {
    double width;
    double height;
    double depth;

    Box4(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}
