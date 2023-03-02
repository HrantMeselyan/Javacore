package group1.Chapter12.MyAnno2;

import group1.Chapter12.MyAnnno1.MyAnno;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "two parameters", val = 19)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("text", 15);
    }
}
