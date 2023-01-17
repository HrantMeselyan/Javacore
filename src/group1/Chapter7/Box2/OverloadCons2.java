package group1.Chapter7.Box2;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(8);

        Box myclone = new Box(mybox1);

        double vol;
        vol = mybox1.volume();
        System.out.println("mybox1.volume = " + vol);
        vol = mybox2.volume();
        System.out.println("mybox2.volume = " + vol);
        vol = mycube.volume();
        System.out.println("mycube.volume = " + vol);
        vol = myclone.volume();
        System.out.println("myclone.volume = " + vol);
    }
}
