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
public class StudentDAOImpl implements StudentDAO {
	SessionFactory sf;
	Session session;
	
	@Override
	public String AddStudent(Student stu) {
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Transaction trans=session.beginTransaction();
		session.save(stu);
		trans.commit();
		session.close();
	    return "added successfully";	
	}

	@Override
	public Student searchById(int studentId) {
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Criteria c=session.createCriteria(Student.class);
		//Query q=session.createQuery("from Student s where s.studentId=si").setParameter("si", studentId);
		List<Student> l=c.list();
		
		return l.get(0);
	}

	@Override
	public String updateStudent(Student stu1) {
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Transaction trans=session.beginTransaction();
		session.saveOrUpdate(stu1);
		trans.commit();
		session.close();
	    return "Updated successfully";
	
	}
//	 Bus bus=SearchBusId(busId);
//	 Transaction t = session.beginTransaction();
//	 try {
//		 session.delete(bus);
//		 t.commit();
//		return "Record delete";
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		//e.printStackTrace();
//		return ("Not Delete ."+e.getMessage());
//		
//		
//	}
	public Student searchById1(Student studentId) {
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Criteria c=session.createCriteria(Student.class);
		//Query q=session.createQuery("from Student s where s.studentId=si").setParameter("si", studentId);
		List<Student> l=c.list();
		
		return l.get(0);
	}
	public String deleteStudent(Student studentId){
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Student student=searchById1(studentId);
		Transaction tran=session.beginTransaction();
		try{
			session.delete(student);
			tran.commit();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return "deleted";
	
	}

}
