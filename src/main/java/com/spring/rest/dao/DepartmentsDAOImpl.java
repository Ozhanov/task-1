package com.spring.rest.dao;

import com.spring.rest.entity.Department;
import com.spring.rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentsDAOImpl implements DepartmentsDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Department> getAllDepartment() {
        Session session = sessionFactory.getCurrentSession();
        List<Department> allDepartment = session.createQuery("from Department", Department.class).getResultList();
        return allDepartment;
    }

    @Override
    public void saveDepartment(Department department) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(department);
    }

    @Override
    public Department getDepartment(int id) {
        Session session = sessionFactory.getCurrentSession();

        Department department = session.get(Department.class, id);
        return department;
    }

    @Override
    public void deleteDepartment(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Department> queue = session.createQuery("delete from Department " + "where id =:departmentId");
        queue.setParameter("departmentId", id);
        queue.executeUpdate();
    }
}
