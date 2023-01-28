package group1.Chapter8.Box;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 = " + vol);
        System.out.println("Weight mybox1 = " + mybox1.weight);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 = " + vol);
        System.out.println("Weight mybox2 = " + mybox2.weight);
    }
}
