package com.example.employee_project.controller;

import com.example.employee_project.Service.EmployeeService;
import com.example.employee_project.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

private EmployeeService employeeService;
@Autowired
    public EmployeeController( EmployeeService employeeService) {
        this.employeeService = employeeService;

    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id){
    Employee employee = employeeService.findById(id);
    if(employee == null){
            throw new RuntimeException("Employee not found");
    }
    return employee;
    }
    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee){
    employeeService.save(employee);
    return employee;
    }
    @DeleteMapping("employees/{id}")
    public void delete(@PathVariable int id){
    employeeService.deleteById(id);
    System.out.println("Employee deleted successfully");
    }

    @PutMapping("/employees/{id}")
    public Employee update(@PathVariable int id, @RequestBody Employee employee) {
        Employee existingEmployee = employeeService.findById(id);

        if (existingEmployee == null) {
            throw new RuntimeException("Employee not found with id: " + id);
        }

        // Update only non-null fields
        if (employee.getFirstName() != null) {
            existingEmployee.setFirstName(employee.getFirstName());
        }
        if (employee.getLastName() != null) {
            existingEmployee.setLastName(employee.getLastName());
        }
        if (employee.getEmail() != null) {
            existingEmployee.setEmail(employee.getEmail());
        }

        // Call service to update in database
        return employeeService.update(existingEmployee);
    }



}




