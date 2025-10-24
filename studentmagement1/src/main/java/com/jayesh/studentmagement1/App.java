package com.jayesh.studentmagement1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jayesh.studentmagement1.util.HibernateUtil;

public class App {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Studentinfo studentinfo = new Studentinfo();
        
        studentinfo.setId(8);
        studentinfo.setName("Aniket");
        studentinfo.setEmail("aniket2004@gmail.com");
        studentinfo.setContactno("8985648652");
        
        
        Session session = HibernateUtil.getSessionFactoryInstance().openSession();
        session.save(studentinfo);
        session.beginTransaction().commit();
        
        session.close();
        
        System.out.println("Record Inserted...");
       
        
        
        
        
    }
}
