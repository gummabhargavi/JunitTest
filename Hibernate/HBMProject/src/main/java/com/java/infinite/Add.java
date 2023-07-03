package com.java.infinite;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Add {
	public static void main(String[] args) {
		SessionFactory sf;
		 sf=SessionHelper.getConnection();
		 Session session=sf.openSession();
		 Student student=new Student("ramya", "ramya@gmail.com", "9231456174", 21, "CSE");
		 Transaction tran=session.beginTransaction();
		 Criteria crt=session.createCriteria(Student.class);
		 session.save(student);
		 tran.commit();
		 session.close();
	}

}
