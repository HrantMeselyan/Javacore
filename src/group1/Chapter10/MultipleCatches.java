package group1.Chapter10;

public class MultipleCatches {
    public static void main(String[] args) {

        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = new int[1];
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println(" / to 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("after try/catch.");
    }
}
