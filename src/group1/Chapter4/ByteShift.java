package group1.Chapter4;

public class ByteShift {
    public static void main(String[] args) {
        int i;
        byte b;
        byte a = 64;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("i : " + a);
        System.out.println("i and b : " + i + " " + b);

    }
}
