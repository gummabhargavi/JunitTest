package com.java.infinite;

import java.sql.SQLException;
import java.util.List;

public class ShowStudent {
	
	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		
		try {
			List<Student> list=dao.showStudent();
			for (Student student : list) {
				System.out.println(student);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
