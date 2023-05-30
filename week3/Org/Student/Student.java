package Org.Student;

import Org.college.College;
import Org.department.Department;

public class Student {

	public void studentName()
	{
		System.out.println("Hemamalini");
	
	}
	public void studentDept()
	{
		System.out.println("ECE");
	}
	
	public void studentId()
	{
		System.out.println("3761");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Stu= new Student();
		College Coll=new College();
		Department Dept= new Department();
		
Stu.studentDept();
Stu.studentId();
Stu.studentName();
Coll.collegeCode();
Coll.collegeName();
Coll.collegeRank();
Dept.deptName();
	}

}
