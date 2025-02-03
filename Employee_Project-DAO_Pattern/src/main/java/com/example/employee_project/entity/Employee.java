package com.example.employee_project.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.IdGeneratorType;
import org.springframework.data.annotation.Id;

@Entity
@Table (name="employee")
public class Employee {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    public Employee( String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Column(name="last_name")
    private String lastName;

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Column(name="email")
    private String email;

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }
}
