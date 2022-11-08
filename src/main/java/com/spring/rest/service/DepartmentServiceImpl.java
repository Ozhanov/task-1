package com.spring.rest.service;

import com.spring.rest.dao.DepartmentsDAO;
import com.spring.rest.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentsDAO departmentDAO;

    @Override
    @Transactional
    public List<Department> getAllDepartment() {
        return departmentDAO.getAllDepartment();
    }

    @Override
    @Transactional
    public void saveDepartment(Department department) {
       departmentDAO.saveDepartment(department);
    }

    @Override
    @Transactional
    public Department getDepartment(int id) {
        return departmentDAO.getDepartment(id);
    }

    @Override
    @Transactional
    public void deleteDepartment(int id) {
       departmentDAO.deleteDepartment(id);
    }
}
