package group1.Chapter12.MyAnno3;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

@What(description = "Annotation of test class")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {

    @What(description = "Annotation test of method")
    @MyAnno(str = "Meta2", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();

            System.out.println("All annotations of class Meta2:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();


            System.out.println("All annotations of method mtMeth():");
            for (Annotation a : annos) {
                System.out.println(a);
            }
        }catch (NoSuchMethodException e){
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
