package com.techlabs.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Department;
import com.techlabs.model.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();

		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory(
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		transaction.begin();

		Employee employee = new Employee();
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();

		Set<Employee> employees = new HashSet<>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);

		Department department = new Department();
		department.setEmployees(employees);

		session.save(department);
		transaction.commit();
		session.close();
	}

}
