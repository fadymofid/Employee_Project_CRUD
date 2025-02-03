package com.example.employee_project.dao;

import com.example.employee_project.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> findAll();
    public Employee findById(int id);
    public void save(Employee employee);
    public void deleteById(int id);
    public Employee update(Employee employee);
}
