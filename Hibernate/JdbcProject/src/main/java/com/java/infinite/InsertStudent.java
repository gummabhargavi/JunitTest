package com.java.infinite;

import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudent {
	public static void main(String[] args) {
		Student stu=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Name");
		stu.setStudentName(sc.next());
		System.out.println("Enter student mail");
		stu.setStudentEmail(sc.next());
		System.out.println("Enter student number");
		stu.setPhoneNumber(sc.next());
		System.out.println("Enter student Age");
		stu.setStudentAge(sc.nextInt());
		System.out.println("Enter student qualifications");
		stu.setStudentQualification(sc.next());
		StudentDAO dao=new StudentDAO();
		try {
			System.out.println(dao.addStudent(stu));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
