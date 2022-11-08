package com.spring.rest.dto;

public class EmployeeDto {
    private String name;
    private String surname;
    private int salary;
    private int department_id;

    public EmployeeDto() {

    }

    public EmployeeDto(String name, String surname, int salary, int department_id) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department_id = department_id;
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

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department_id=" + department_id +
                '}';
    }
}
