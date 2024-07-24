package com.validation.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.validation.example.entity.Employee;
import com.validation.example.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class EmployeeController {
  @Autowired
  EmployeeService employeeService;

  @GetMapping("/employee")
  public String lstEmployee(Model thModel) {
    List<Employee> lstEmployee = employeeService.findEmployees();
    thModel.addAttribute("lstEmployee", lstEmployee);
    return "employee";
  }

  @GetMapping("/employeeForm")
  public String employeeForm(Model thModel) {
    thModel.addAttribute("employee", new Employee());
    return "modal-employee";
  }

  @PostMapping("/save")
  public String postMethodName(@ModelAttribute("employee") Employee entity) {
      System.out.println(entity);
      employeeService.save(entity);
      return "redirect:/employee";
  }
  
}
