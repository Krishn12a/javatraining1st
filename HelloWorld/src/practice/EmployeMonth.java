package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeMonth {
	static ArrayList<String> emp=new ArrayList<String>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		emp.add("Muthu");
		emp.add("Dola");
		emp.add("Ak");
		emp.add("sandy");
		emp.add("pradeep");
		emp.add("universenathan");
		emp.add("kishore");
		emp.add("Raj");
//		System.out.println(emp);
		
		String con="";
		do {
			System.out.println("Enter the Month : ");
			String month=sc.next();
			switch (month) {
			case "January": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			case "February": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			case "March": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			case "April": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			case "May": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			case "June": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			case "July": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			case "August": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			case "September": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			case "October": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			case "November": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			case "December": {
				System.out.println("Winnner of the "+month+" is "+emp.get(randomEmp()));
				
			}break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + month);
			}
			System.out.println("\n\nDo you want to see another Month ?Type(y/n)");
			con=sc.next();
		}while(con.equalsIgnoreCase("y"));	
		
	}
	
	public static int randomEmp() {
		int rnmber=emp.size()-1;
		int randomNumber=(int) (Math.random()*rnmber);
		return randomNumber;
	}
}
