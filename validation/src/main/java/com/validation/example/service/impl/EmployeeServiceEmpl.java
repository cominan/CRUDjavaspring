package com.validation.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.example.entity.Employee;
import com.validation.example.repository.EmployeeRepo;
import com.validation.example.service.EmployeeService;

@Service
public class EmployeeServiceEmpl implements EmployeeService {
  @Autowired EmployeeRepo employeeRepo;

  public List<Employee> findEmployees() {
    return employeeRepo.findAll();
  }

  public void save(Employee employee) {
    employeeRepo.save(employee);
  }
}
