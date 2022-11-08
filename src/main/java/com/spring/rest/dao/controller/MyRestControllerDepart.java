package com.spring.rest.dao.controller;

import com.spring.rest.entity.Department;
import com.spring.rest.entity.Employee;
import com.spring.rest.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestControllerDepart {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> showAllDepartment(){
        List<Department> allDepartment = departmentService.getAllDepartment();
        return allDepartment;
    }

    @GetMapping("/departments/{id}")
    public Department getDepartment(@PathVariable int id){
        Department department = departmentService.getDepartment(id);

        return department;
    }

    @PutMapping("/departments")
    public Department addNewDepartment(@RequestBody Department department){
        departmentService.saveDepartment(department);
        return department;
    }

    @PostMapping("/departments")
    public Department updateDepartment(@RequestBody Department department){
        departmentService.saveDepartment(department);
        return department;
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartment(@PathVariable int id){
        Department department = departmentService.getDepartment(id);

        departmentService.deleteDepartment(id);
        return "Employee with ID = " + id + " was deleted";
    }


}
