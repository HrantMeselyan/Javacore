package group1.Chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("conversion int to byte");
        b = (byte) i;
        System.out.println(" i and b " + i + " " + b);

        System.out.println("conversion double to int");
        i = (int) d;
        System.out.println(" d and i " + d + " " + i);

        System.out.println("conversion double to byte");

        b = (byte) d;

        System.out.println(" b and d " + b + " " + d);

    }
}
