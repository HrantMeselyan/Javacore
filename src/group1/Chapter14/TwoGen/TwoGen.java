package group1.Chapter14.TwoGen;

public class TwoGen<T, V> {
    T ob;
    V ob2;

    TwoGen(T obj, V obj2) {
        ob = obj;
        ob2 = obj2;
    }

    void showTypes() {
        System.out.println("Type of T : " + ob.getClass().getName());
        System.out.println("Type of V : " + ob2.getClass().getName());
    }

    T getOb() {
        return ob;
    }

    V getOb2() {
        return ob2;
    }
};
