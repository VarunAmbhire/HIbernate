package com.techlabs.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Actor;
import com.techlabs.model.Movie;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory(
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());

		Session session = sessionFactory.openSession();

		Actor actor = new Actor();

		Set<Movie>movies=new HashSet<>();
		
		Movie movie = new Movie();
		Movie movie2=new Movie();
		Movie movie3=new Movie();
		
		movies.add(movie);
		movies.add(movie2);
		movies.add(movie3);
		
		actor.setMovie(movies);

		session.save(actor);

	}

}
