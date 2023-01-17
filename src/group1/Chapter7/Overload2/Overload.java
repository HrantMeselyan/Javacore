package group1.Chapter7.Overload2;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(4,5);
        ob.test(i);
        ob.test(4.5);

    }
}
