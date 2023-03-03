package group1.Chapter12.TypeAnno;
import java.lang.annotation.*;
@Target(ElementType.TYPE_PARAMETER)
public @interface What {
    String description();
}
