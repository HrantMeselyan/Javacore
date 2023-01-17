package group1.Chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box2 mybox = new Box2();
        Box2 mybox2 = new Box2();
        double vol;

        mybox.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        vol = mybox.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);


    }
}
