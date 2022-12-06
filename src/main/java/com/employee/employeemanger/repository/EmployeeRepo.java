package com.employee.employeemanger.repository;

import com.employee.employeemanger.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    Employee findEmployeeById(Long id);
}

