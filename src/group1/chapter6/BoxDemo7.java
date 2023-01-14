package group1.chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box4 mybox = new Box4(10, 20, 15);
        Box4 mybox2 = new Box4(3, 6, 9);

        double vol;

        vol = mybox.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);
    }
}
