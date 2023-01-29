package group1.Chapter8.Box;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Volume = " + vol);
        System.out.println("Weight = " + weightBox.weight);
        System.out.println();

        plainbox = weightBox;
        vol = plainbox.volume();

        System.out.println("Volume plainBox = " + vol);

        // Error:  System.out.println("Weight plainBox = " + plainBox.weigh);
    }
}
