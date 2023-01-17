package group1.Chapter7.Test3;

public class Test {
    int a;
    int b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    void  meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}
