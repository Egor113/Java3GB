package tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface TestAnnotation
{
    boolean test() default false;

    boolean beforeSuite() default false;

    boolean afterSuite() default false;

    int priority() default 1;
}
