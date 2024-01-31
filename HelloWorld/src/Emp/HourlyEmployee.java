package Emp;

public class HourlyEmployee extends Employee{
	private int hourlyrate;
	private int hoursworked;
	
	
	public HourlyEmployee(String name,String jobTitle,String company,String department,int hourlyrate,int hoursworked) {
		super(name,jobTitle,company,department);
		this.hourlyrate=hourlyrate;
		this.hoursworked=hoursworked;
		
	}


	public int getHourlyrate() {
		return hourlyrate;
	}


	public int getHoursworked() {
		return hoursworked;
	}
	
	public int calcpay() {
		super.getEmployeeDetails();
		return getHourlyrate()*getHoursworked();
	}

}
