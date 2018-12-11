package com.techlabs.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Student;

public class Test {
	static SessionFactory sessionFactory;
	static Session session;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();

		configuration.configure("hibernate.cfg.xml");

		sessionFactory = configuration.buildSessionFactory(
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
//		System.out.println(sessionFactory.getClass());
		session = sessionFactory.openSession();

		Student student = new Student();
		student.setfName("Varun");
		student.setlName("Ambhire");
		write(student);
//		update(2, student);

		Iterator iterator = read().iterator();

		while (iterator.hasNext()) {
			Student stud = (Student) iterator.next();
			System.out.println(stud.getId() + " " + stud.getfName() + " " + stud.getlName());
		}

	}

	static List<Student> read() {
		session.beginTransaction();
		List<Student> students = session.createQuery("FROM Student").list();
		session.close();
		return students;
	}

	static void write(Student student) {
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
	}

	static void update(int id, Student student) {
		Transaction transaction=session.beginTransaction();
		Student student2 = (Student) session.load(Student.class, id);
		System.out.println(student2.getfName());
		student2 = student;
		System.out.println(student2.getfName());
		session.update(student2);
		transaction.commit();
		session.close();
	}

}
