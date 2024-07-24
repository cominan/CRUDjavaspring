package com.validation.example.validation;

import jakarta.validation.ConstraintValidator;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
  private String coursePrefix;

  @Override
  public void initialize(CourseCode constraintAnnotation) {
    coursePrefix = constraintAnnotation.value();
  }

  @Override
  public boolean isValid(String value, jakarta.validation.ConstraintValidatorContext context) {

    boolean result = value != null && value.startsWith(coursePrefix);

    return result;
  }


}
