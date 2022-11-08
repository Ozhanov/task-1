package com.spring.rest.service;

import com.spring.rest.dao.DepartmentsDAO;
import com.spring.rest.dao.EmployeesDAO;
import com.spring.rest.dto.EmployeeDto;
import com.spring.rest.dto.EmployeeWithDepartament;
import com.spring.rest.entity.Department;
import com.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeesDAO employeesDAO;
    @Autowired
    private DepartmentsDAO departmentsDAO;


    @Override
    @Transactional
    public List<EmployeeWithDepartament> getAllEmployees() {
        return employeesDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public EmployeeWithDepartament saveEmployee(EmployeeDto dto) {

        Department department = departmentsDAO.getDepartment(dto.getDepartment_id());

        Employee employee = new Employee();
        employee.setName(dto.getName());
        employee.setSurname(dto.getSurname());
        employee.setSalary(dto.getSalary());
        employee.setDep(department);

        employeesDAO.saveEmployee(employee);

        EmployeeWithDepartament result = new EmployeeWithDepartament();
        result.setSalary(employee.getSalary());
        result.setName(employee.getName());
        result.setSurname(employee.getSurname());
        result.setId(employee.getId());

        result.setDepartment_id(department.getId());
        result.setDepartmentAddress(department.getAddress());
        result.setDepartmentName(department.getName());

        return result;
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeesDAO.getEmployees(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeesDAO.deleteEmployee(id);
    }
}
