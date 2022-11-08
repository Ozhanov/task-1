package com.spring.rest.dao.controller;

import com.spring.rest.dto.EmployeeDto;
import com.spring.rest.dto.EmployeeWithDepartament;
import com.spring.rest.entity.Employee;
import com.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeWithDepartament> showAllEmployee(){
        List<EmployeeWithDepartament> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);

        return employee;
    }

    @PutMapping("/employees")
    public EmployeeWithDepartament addNewEmployee(@RequestBody EmployeeDto dto){
        EmployeeWithDepartament result = employeeService.saveEmployee(dto);
        return result;
    }

    @PostMapping("/employees")
    public EmployeeWithDepartament updateEmployee(@RequestBody EmployeeDto dto){
        EmployeeWithDepartament result = employeeService.saveEmployee(dto);
        return result;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);

        employeeService.deleteEmployee(id);
        return "Employee with ID = " + id + " was deleted";
    }
}
