package group1.Chapter7.Overload2;

public class OverloadDemo {
    void test() {
        System.out.println("missing parameters");
    }

    void test(int a, int b) {
        System.out.println("a and b : " + a + " " + b);
    }
    void test(double a){
        System.out.println("test(double) a : " + a);
    }
}
