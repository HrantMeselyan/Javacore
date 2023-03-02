package group1.Chapter12.MyAnno3;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}
