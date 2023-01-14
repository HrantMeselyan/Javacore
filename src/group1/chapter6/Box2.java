package group1.chapter6;

public class Box2 {
    double height;
    double width;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
