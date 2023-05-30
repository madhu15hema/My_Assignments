package Inheritance_Assignment2_Week3.day2;

public class Axis_Bank extends BankInfo {

	public void deposit()
	{
		System.out.println(" The amount one lakh has been deposited in savings account");
	}
	public static void main(String[] args) {
		
		Axis_Bank A=new Axis_Bank();
	    A.deposit();
	    A.fixed();A.savings();
		// TODO Auto-generated method stub

	}

}
