package com.spring.rest.dto;

public class EmployeeWithDepartament {
    private int id;
    private String name;
    private String surname;
    private int salary;
    private int department_id;
    private String departmentName;
    private String departmentAddress;

    public EmployeeWithDepartament() {

    }

    public EmployeeWithDepartament(int id, String name, String surname, int salary, int department_id, String departmentName, String departmentAddress) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department_id = department_id;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public EmployeeWithDepartament(String name, String surname, int salary, int department_id, String departmentName, String departmentAddress) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department_id = department_id;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
    }


    @Override
    public String toString() {
        return "EmployeeWithDepartament{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department_id=" + department_id +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                '}';
    }
}
