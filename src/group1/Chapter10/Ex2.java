package group1.Chapter10;

public class Ex2 {
    public static void main(String[] args) {
        int d;
        int a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("This code not worked");
        } catch (ArithmeticException e) {
            System.out.println(" / to 0");
        }
        System.out.println("after catch");
    }
}
