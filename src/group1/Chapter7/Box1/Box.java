package group1.Chapter7.Box1;

public class Box {
    double height;
    double width;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        depth = -1;
        height = -1;
    }

    Box(double len) {
        width = depth = height = len;
    }

    double volume() {
        return width * height * depth;
    }

}
