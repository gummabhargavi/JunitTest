package com.java.infinite;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class A {
public static void main(String[] args) {
	SessionFactory sf;
	sf=SessionHelper.getConnection();
	Session session =sf.openSession();
	Query query=session.createQuery("from StudentEntity");
	
	List<StudentEntity> ls=session.createCriteria(StudentEntity.class).list();
	System.out.println(ls);
}
}
