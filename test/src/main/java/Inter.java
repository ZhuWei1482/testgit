import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Inter {
        int min() default 0;
        int max() default 255;


}
