package com.example.employee_project.JPA;

import com.example.employee_project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
@RepositoryRestResource(path="employees")
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {  //Integer is the primary key type


}
