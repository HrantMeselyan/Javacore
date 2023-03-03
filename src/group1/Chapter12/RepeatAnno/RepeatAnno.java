package group1.Chapter12.RepeatAnno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {
    @MyAnno(str = "first annotation", val = -1)
    @MyAnno(str = "second annotation", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try{
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation anno  = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        }catch (NoSuchMethodException e){
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("Test",10);
    }
}
