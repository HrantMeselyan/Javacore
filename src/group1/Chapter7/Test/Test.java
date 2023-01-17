package group1.Chapter7.Test;

public class Test {
    int a;
    int b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        }
        return false;
    }
}
