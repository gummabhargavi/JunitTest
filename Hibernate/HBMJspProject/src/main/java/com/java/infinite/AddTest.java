package com.java.infinite;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddTest {
		
	public static void main(String[] args) {
		SessionFactory sf=SessionHelper.getConnection();
		Session session=sf.openSession();
		Student s=new Student(2, "sandhya", "sandhya@gmail.com", "6754321122", 23, "CSE");
		Transaction trans=session.beginTransaction();
		Criteria crt=session.createCriteria(Student.class);
		session.save(s);
		trans.commit();
		session.close();
		
	}
	

}
