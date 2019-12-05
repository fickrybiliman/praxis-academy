import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation {
   String Developer() default "Rahul";
   String Expirydate();
}

public class RetentionTest {
   
}