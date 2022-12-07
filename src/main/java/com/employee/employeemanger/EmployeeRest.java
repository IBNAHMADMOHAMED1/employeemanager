package com.employee.employeemanger;

import com.employee.employeemanger.model.Employee;
import com.employee.employeemanger.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // This means that this class is a Controller
@RequestMapping("/api/v1/employees")
public class EmployeeRest {
    private final EmployeeService empS;

    public EmployeeRest(EmployeeService empS) {
        this.empS = empS;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = empS.findAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        Employee employee = empS.findEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

}
