package com.spring.rest.service;

import com.spring.rest.entity.Department;
import com.spring.rest.entity.Employee;

import java.util.List;

public interface DepartmentService {
    public List<Department> getAllDepartment();

    public void saveDepartment(Department department);

    public Department getDepartment(int id);

    public void deleteDepartment(int id);
}

