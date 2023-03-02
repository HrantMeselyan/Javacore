package group1.Chapter12.MarkerAnotation;

import java.lang.reflect.*;

public class Marker {
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            if(m.isAnnotationPresent(MyMarker.class)){
                System.out.println("Marker anotation was present");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
