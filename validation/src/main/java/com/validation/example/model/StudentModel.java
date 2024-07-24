package com.validation.example.model;

import com.validation.example.validation.CourseCode;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class StudentModel {
  private String firstName;

  @NotNull(message = "Last name cannot be null")
  @Size(min = 1, message = "Last name cannot be empty")
  private String lastName = "";

  @Min(value = 5, message = "Passes cannot be lesser than 5")
  @Max(value = 17, message = "Passes cannot be greater than 17")
  private int freePasses ;


  @CourseCode
  private String courseCode;

  public String getFirstName() {
    return firstName;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getFreePasses() {
    return freePasses;
  }

  public void setFreePasses(int freePasses) {
    this.freePasses = freePasses;
  }

}
