package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spring.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private SessionFactory sessionFactory;
	
	public EmployeeDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.save(employee);
	}
	


}
