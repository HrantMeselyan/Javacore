package group1.Chapter14.NonGen;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Object ob type is " + ob.getClass().getName());
    }
}
