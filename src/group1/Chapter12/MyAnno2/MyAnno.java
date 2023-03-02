package group1.Chapter12.MyAnno2;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();
    int val();
}
