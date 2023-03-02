package group1.Chapter12.SingleAnotation;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value();
}
