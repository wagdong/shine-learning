package com.shine.annotation.mvc;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({PARAMETER})
@Retention(RUNTIME)
public @interface Add {

    /**
     * The request parameter to bind to.
     */
    String value() default "";
}
