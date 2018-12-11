package com.techlabs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Exhibitor;
import com.techlabs.model.Stall;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		
		SessionFactory sessionFactory=configuration.buildSessionFactory(
				new  StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
		
		Session session=sessionFactory.openSession();
		
		Stall stall=new Stall();
		
		Exhibitor exhibitor=new Exhibitor();
		
		exhibitor.setStall(stall);
		
		
		session.save(exhibitor);
		
	}

}
