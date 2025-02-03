package com.example.employee_project.Service;

import com.example.employee_project.JPA.EmployeeRepo;
import com.example.employee_project.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<Employee> findAll() {
      return employeeRepo.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        }
        else{
            throw new RuntimeException("Employee Not Found");
        }

    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeeRepo.deleteById(id);
    }


}
