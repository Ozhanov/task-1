package com.spring.rest.dao;

import com.spring.rest.dto.EmployeeWithDepartament;
import com.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeesDAO {
    public List<EmployeeWithDepartament> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployees(int id);

    public void deleteEmployee(int id);
}
