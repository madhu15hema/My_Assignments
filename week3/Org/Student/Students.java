package Org.Student;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("the student id is" +id);
	}

	public void getStudentInfo(int id, String name)
	{
		System.out.println("The id of the student is" +id);
		System.out.println("The Student Name is" +name);
	}
	
	public void getStudentInfo(String Email, long Phone_number)
	{
		System.out.println("The email id is" +Email);
		System.out.println("The phone_number is "+Phone_number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stubL
Students Stud=new Students();
Stud.getStudentInfo(36);
Stud.getStudentInfo(54, "Madhu");
Stud.getStudentInfo("madhu08@gmail.com", 9941471750L);

		
	}
}
