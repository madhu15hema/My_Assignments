package Week1.day1;

public class car {
	
 void driveCar()
 {
	 System.out.println("Drive the car carefully");
	 
 }
 
 void applyBreak()
 {
	 System.out.println("Apply the break when their is a speedbreaker");
 }

 void soundHorn()
 {
	 System.out.println("Press the horn when the green signal is shown to reflect the befre vehicle to move");
 }
 
 void isPuncture()
 {
	 System.out.println("Check whether the car is puncture");
 }
	public static void main(String[] args) {
		
		car cc=new car();
		cc.driveCar();
		cc.applyBreak();
		cc.soundHorn();
		cc.isPuncture();
		

	}

}
