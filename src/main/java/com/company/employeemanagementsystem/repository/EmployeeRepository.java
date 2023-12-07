// src/main/java/com/company/employeemanagementsystem/repository/EmployeeRepository.java

package com.company.employeemanagementsystem.repository;

import com.company.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}