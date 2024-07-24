package com.validation.example.validation;
import java.lang.annotation.*;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

  public String value() default "LUV";

  public String message() default "Must start with LUV";

  public Class<?>[] groups() default {};

  public Class<? extends Payload>[] payload() default {};

}
