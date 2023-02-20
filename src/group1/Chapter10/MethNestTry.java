package group1.Chapter10;

public class MethNestTry {
    static void nestTry(int a) {
        try {
            if (a == 1) {
                a = a / (a - a);
            }
            if (a == 2) {
                int c[] = {1};
                c[42] = 7;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundException");
        }

    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 43 / a;
            System.out.println("a = " + a);
            nestTry(a);
        } catch (ArithmeticException e) {
            System.out.println(" / to 0");
        }
    }
}

