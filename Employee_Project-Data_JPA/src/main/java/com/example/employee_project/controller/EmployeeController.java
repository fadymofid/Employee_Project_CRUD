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
    employee.setId(0);
    employeeService.save(employee);
    return employee;
    }
    @DeleteMapping("employees/{id}")
    public void delete(@PathVariable int id){
    employeeService.deleteById(id);

    }

  @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee){
    employeeService.save(employee);
    return employee;

  }



}




