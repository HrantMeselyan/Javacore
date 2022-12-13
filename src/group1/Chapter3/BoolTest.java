package group1.Chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;

        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);
        if (b) {
            System.out.println("this code is working");
        }
        b = false;
        if (b) {
            System.out.println("this code is not working");
        }
        System.out.println(" 10 > 9  " + (10 > 9));
    }
}
