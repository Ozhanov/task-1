package com.spring.rest.dao;

import com.spring.rest.entity.Department;
import com.spring.rest.entity.Employee;

import java.util.List;

public interface DepartmentsDAO {
    public List<Department> getAllDepartment();

    public void saveDepartment(Department Department);

    public Department getDepartment(int id);

    public void deleteDepartment(int id);
}
