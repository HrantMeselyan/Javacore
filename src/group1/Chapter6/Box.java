package group1.Chapter6;

public class Box {

    double height;
    double width;
    double depth;

    void volume() {
        System.out.println("volume = " + width * depth * height);
    }

    double volume2() {
        return width * height * depth;

    }
}
