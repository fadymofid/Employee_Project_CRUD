package com.example.employee_project.dao;

import com.example.employee_project.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao {

    private EntityManager em;
    @Autowired
    public EmployeeDaoJpaImpl(EntityManager em) {
        this.em = em;
    }
    public List<Employee> findAll() {
       TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e", Employee.class);
       return query.getResultList();
    }
    public Employee findById(int id) {
        return em.find(Employee.class, id);

    }
    public void save(Employee employee) {
        em.persist(employee);
    }
    public Employee update(Employee employee) {
        return em.merge(employee);
    }
    public void  deleteById(int id) {
        Employee employee = em.find(Employee.class, id);
        em.remove(employee);
    }
}
