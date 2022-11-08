package com.spring.rest.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "department_name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dep")
        private List<Employee> emps;

    public Department(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
      



    public Department(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmps() {
        return emps;
   }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
   }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
               '}';
    }
}
