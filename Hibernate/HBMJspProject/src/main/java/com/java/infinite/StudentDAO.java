package com.java.infinite;

import java.util.List;

public interface StudentDAO {
	
	public String AddStudent(Student stu);
	public Student searchById(int studentId);
	public String updateStudent(Student stu1);

}
