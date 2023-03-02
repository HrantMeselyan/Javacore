package group1.Chapter12.SingleAnotation;

import java.lang.reflect.Method;

public class Single {
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            MySingle anno = m.getAnnotation(MySingle.class);

            System.out.println(anno.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Wrong method name");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
