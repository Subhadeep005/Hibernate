package com.codingraja.hibernate.test;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Color;
import com.codingraja.hibernate.domain.Product;

public class GetColor {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
			Color color = session.get(Color.class, new Long(1));
			System.out.println("Color ID :"+color.getId());
			System.out.println("Color Name :"+color.getColName());
			session.close();
			System.out.println("Color is Get successfully");
	}
}
