// src/main/java/com/company/employeemanagementsystem/service/EmployeeService.java

package com.company.employeemanagementsystem.service;

import com.company.employeemanagementsystem.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}