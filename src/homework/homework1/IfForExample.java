package homework.homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;

        if (a > b) {
            System.out.println("max = " + a);
        } else {
            System.out.println("max = " + b);
        }

        System.out.println();

        int c = 20;
        int d = 25;

        for (int i = c; i < d + 1; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        int h = 88;
        char e = (char) h;

        System.out.println(e);

        if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a =! b");
        }
    }
}
