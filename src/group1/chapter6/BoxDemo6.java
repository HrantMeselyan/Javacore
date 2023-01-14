package group1.chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box3 myBox = new Box3();
        Box3 myBox2 = new Box3();

        double vol;

        vol = myBox.volume();
        System.out.println(vol);

        vol = myBox2.volume();
        System.out.println(vol);
    }
}
