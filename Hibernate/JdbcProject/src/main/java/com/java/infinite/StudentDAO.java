package com.java.infinite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class StudentDAO {
	
	Connection con;
	PreparedStatement pst;
	
	public String addStudent(Student stu) throws ClassNotFoundException, SQLException{
		
		con=ConnectionHelper.getConnection();
		String cmd="insert into Student(stu_name,stu_email,stu_phno,stu_age,stu_qualification)"+"values(?,?,?,?,?)";
		pst=con.prepareStatement(cmd);
		pst.setString(1, stu.getStudentName());
		pst.setString(2, stu.getStudentEmail());
		pst.setString(3, stu.getPhoneNumber());
		pst.setInt(4, stu.getStudentAge());
		pst.setString(5, stu.getStudentQualification());
		pst.executeUpdate();
		return "Inserted";
		
	}
   
	public List<Student> showStudent() throws ClassNotFoundException, SQLException{
		List<Student> list=new ArrayList<>();
		con=ConnectionHelper.getConnection();
		String cmd="select * from Student";
		pst=con.prepareStatement(cmd);
		ResultSet rset=pst.executeQuery();
		Student stu=null;
		while (rset.next()) {
			 stu=new Student();
			stu.setStudentId(rset.getInt("stu_id"));
			stu.setStudentName(rset.getString("stu_name"));
			stu.setStudentEmail(rset.getString("stu_email"));
			stu.setPhoneNumber(rset.getString("stu_phno"));
			stu.setStudentAge(rset.getInt("stu_age"));
			stu.setStudentQualification(rset.getString("stu_qualification"));
			list.add(stu);
		}
		return list;
			
	}
}
