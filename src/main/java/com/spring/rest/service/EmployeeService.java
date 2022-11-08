package com.spring.rest.service;

import com.spring.rest.dto.EmployeeDto;
import com.spring.rest.dto.EmployeeWithDepartament;
import com.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<EmployeeWithDepartament> getAllEmployees();

    public EmployeeWithDepartament saveEmployee(EmployeeDto employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
