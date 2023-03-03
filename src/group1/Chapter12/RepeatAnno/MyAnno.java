package group1.Chapter12.RepeatAnno;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)

public @interface MyAnno {
    String str() default "testing";
    int val() default 9000;
}
