package Emp;

public class Getdetials {

	public static void main(String[] args) {
		HourlyEmployee h=new HourlyEmployee("Ananthu krishnan", "Analyst Trainee", "Changepond", "Developer", 200,20 );
		System.out.println("\n............Hourly employee...............\n");

		System.out.println("Hourly employee salary : "+h.calcpay());
		System.out.println("\n............Weekly employee...............\n");
		WeeklyEmployee w=new WeeklyEmployee(" krishnan", "Quality Trainee", "Changepond", "Testing", 6000,2 );

		System.out.println("weekly employee salary : "+w.calcpay());
	
	
	}
}
