package com.java.infinite;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



@ManagedBean
@SessionScoped
public class StudentDAOImp1 implements StudentDAO1 {
	 
	SessionFactory sf;

	public List<StudentEntity> showStudent() {
		sf=SessionHelper.getConnection();
		Session session =sf.openSession();
		Query query=session.createQuery("from StudentEntity");
		Transaction t = session.beginTransaction();
		List<StudentEntity> ls=session.createCriteria(StudentEntity.class).list();
		return ls;
	}
	
	
	

}
