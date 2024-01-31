package Emp;

public class WeeklyEmployee extends Employee{
	private int weeklyrate;
	private int weeksworked;
	
	public WeeklyEmployee(String name,String jobTitle,String company,String department,int weeklyrate,int weeksworked) {
		super(name,jobTitle,company,department);
		this.weeklyrate=weeklyrate;
		this.weeksworked=weeksworked;
	}

	public int getWeeklyrate() {
		return weeklyrate;
	}

	public int getWeeksworked() {
		return weeksworked;
	}
	
	public int calcpay() {
		super.getEmployeeDetails();
		return getWeeklyrate()*getWeeksworked();
	}
	

}
