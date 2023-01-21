package group1.Chapter7.Outer;

public class Outer {
    int outerX = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("conclusion : outerX = " + outerX);
        }
    }
}
