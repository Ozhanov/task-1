package com.spring.rest.dao;

import com.spring.rest.dto.EmployeeWithDepartament;
import com.spring.rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeesDAOImpl implements EmployeesDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<EmployeeWithDepartament> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> allEmployees = session.createQuery("from Employee", Employee.class).getResultList();

        List<EmployeeWithDepartament> dtoList = new ArrayList<>();

        for (Employee e: allEmployees) {
            EmployeeWithDepartament result = new EmployeeWithDepartament();
            result.setSalary(e.getSalary());
            result.setName(e.getName());
            result.setSurname(e.getSurname());
            result.setId(e.getId());
            result.setDepartment_id(e.getDep().getId());
            result.setDepartmentAddress(e.getDep().getAddress());
            result.setDepartmentName(e.getDep().getName());

            dtoList.add(result);
        }

        return dtoList;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployees(int id) {
        Session session = sessionFactory.getCurrentSession();

        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Employee> queue = session.createQuery("delete from Employee " + "where id =:employeeId");
        queue.setParameter("employeeId", id);
        queue.executeUpdate();
    }
}
