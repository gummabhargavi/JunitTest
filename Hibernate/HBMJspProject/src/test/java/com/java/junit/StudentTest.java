package com.java.junit;
import com.java.infinite.*;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testTostring(){
		Student stu=new Student(1,"sumanth", "sumanth@gmail.com", "2310879087", 23, "B.Tech");
		String results="Student [studentId=" + 1 + ", studentName=" + "sumanth" + ", studentEmail=" + "sumanth@gmail.com"
				+ ", phoneNumber=" + "2310879087" + ", studentAge=" + 23 + ", studentQualification="
				+ "B.Tech" + "]";
		assertEquals(results, stu.toString());
		
	}
	@Test
	public void setTest2(){
		Student stu1=new Student();
		stu1.setStudentName("Bhargavi");
		stu1.setPhoneNumber("7865433699");
		stu1.setStudentEmail("gmail.com");
		stu1.setStudentAge(23);
		stu1.setStudentQualification("B.Tech");
		StudentDAOImpl dao=new StudentDAOImpl();
		String str=dao.AddStudent(stu1);
		assertEquals("added successfully", str);
	}
	
	@Test
	public void searchTest3(){
		Student stu=new Student();
		stu.getStudentId();
		stu.getStudentName();
		stu.getStudentEmail();
		stu.getPhoneNumber();
		stu.getStudentAge();
		stu.getStudentQualification();
		StudentDAOImpl dao1=new StudentDAOImpl();
		Student s=dao1.searchById(0);;
		equals(s);
		
	}
	
		@Test
	public void updateTest4(){
		Student stu4=new Student();
		stu4.setStudentId(1);
		stu4.setStudentName("Bharu");
		stu4.setPhoneNumber("456743298");
		stu4.setStudentEmail("bhargavi@gmail.com");
		stu4.setStudentAge(23);
		stu4.setStudentQualification("CSE");
		StudentDAOImpl dao2=new StudentDAOImpl();
		String str1=dao2.updateStudent(stu4);
		assertEquals("Updated successfully", str1);
	}
    @Test
    public void deleteTest5(){
    	Student stu5=new Student();
    	stu5.getStudentId();
    	stu5.getStudentName();
    	stu5.getStudentEmail();
    	stu5.getPhoneNumber();
    	stu5.getStudentAge();
    	stu5.getStudentQualification();
    	StudentDAOImpl impl=new StudentDAOImpl();
    	String i=impl.deleteStudent(stu5);
    	assertEquals("deleted", i);
    }
}
