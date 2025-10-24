package com.jayesh.studentmagement1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentInfo {
	
	public static void main(String[] args) {
		
		Studentinfo studentinfo;
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Studentinfo.class);
		
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		studentinfo = session.get(Studentinfo.class, 7);
		
		System.out.println(studentinfo.toString());
		
		studentinfo.setName("Ajay");
		studentinfo.setEmail("ajay@gmail.com");
		studentinfo.setContactno("9889655632");
		
		session.beginTransaction();
		session.update(studentinfo);
		session.getTransaction().commit();
		
		System.out.println("Record is Updates...");
		
	}

}
