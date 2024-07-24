package com.validation.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.validation.example.entity.Employee;

@Service
public interface EmployeeService {
  List<Employee> findEmployees();

  void save(Employee employee);
}
