package group1.Chapter12.TypeAnno;
import java.lang.annotation.*;

@Target(ElementType.TYPE_USE)
public @interface MaxLen {
    int value();
}
