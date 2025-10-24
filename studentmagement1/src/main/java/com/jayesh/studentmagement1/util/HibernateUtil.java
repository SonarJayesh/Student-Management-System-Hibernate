package com.jayesh.studentmagement1.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jayesh.studentmagement1.Studentinfo;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory;
	
	private HibernateUtil() {
		
	}
	
		public static SessionFactory getSessionFactoryInstance() {
			
			if (sessionFactory == null) {
				
				Configuration configuration = new Configuration();
				configuration.configure();
				configuration.addAnnotatedClass(Studentinfo.class);
				sessionFactory = configuration.buildSessionFactory();
			}
			
			return sessionFactory;
		}
	
	
}
