package Emp;

public class Employee {
	private String name;
	private String jobTitle;
	private String company;
		
	private String department;
	
	
	public Employee() {
		name="Muthu krishnan";
		jobTitle="Analyst trainee";
		company="Changepond";
		department="Developer";
	}
	
	public Employee(String name,String jobTitle,String company,String department) {
		this.name=name;
		this.jobTitle=jobTitle;
		this.company=company;
		this.department=department;

	}


	public String getName() {
		return name;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public String getCompany() {
		return company;
	}


	public String getDepartment() {
		return department;
	}
	
	public int calcpay() {
		return 0;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee name : "+getName());
		System.out.println("Employee jobTitle : "+getJobTitle());
		System.out.println("Employee company : "+getCompany());
		System.out.println("Employee department : "+getDepartment());
	
	}
	

}
