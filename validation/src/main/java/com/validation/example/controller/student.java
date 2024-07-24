package com.validation.example.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validation.example.model.StudentModel;

import jakarta.validation.Valid;

@Controller
public class student {


  @InitBinder
  public void initBinder(org.springframework.web.bind.WebDataBinder binder) {
    StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
    binder.registerCustomEditor(String.class, stringTrimmerEditor);
  }
  @GetMapping("/")
  public String Home(Model thModel) {
    thModel.addAttribute("student", new StudentModel());
    return "student-form";
  }
  @PostMapping("/student")
  public String Student(@Valid @ModelAttribute("student") StudentModel student, BindingResult result) {
    if (result.hasErrors()) {
      return "student-form";
    } else {
      return "student-confirmation";
    }
  }
}
