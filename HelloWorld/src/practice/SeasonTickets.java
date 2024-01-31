package practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class SeasonTickets {
	
	static Queue<String> emp=new LinkedList<String>();
	static Queue<String>waitlist=new LinkedList<String>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		emp.add("Muthu");
		emp.add("Dola");
		emp.add("Ak");
		emp.add("sandy");
		emp.add("pradeep");
		emp.add("universenathan");
		emp.add("kishore");
		emp.add("Vicky");
		emp.add("Durai");
		emp.add("Goutham");
		emp.add("Gopal");
		emp.add("Yogi");
		emp.add("Lord");
		emp.add("Muhunthan");
		emp.add("satya");
		String con="";
//		waitlist.addAll(emp);
//		booking();
		do {
			System.out.println("Enter the tickets : ");
			int ticket=sc.nextInt();
			System.out.println("Enter the no of employees going to register : ");
			int empno=sc.nextInt();
			employee(empno);
			WaitList(ticket);	
			System.out.println("\n\nRemaining members in waiting list : "+waitlist);
			System.out.println("\n\nDo you have extra Tickets again?Type(y/n)");
			con=sc.next();
			if(!con.equalsIgnoreCase("y")) {
				System.out.println("\n\nRemaining members in waiting list : "+waitlist);
			}
		}while(con.equalsIgnoreCase("y"));
		
		
		
	}
	public static void employee(int empno) {
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i <empno; i++) {
			
			System.out.println("Enter the Enployees to need tickets : ");
			String name=sc.next();
		
		if(emp.contains(name)) {
			waitlist.add(name);
		}
		else {
			System.out.println("Name does'nt exist");
		}
	}
	}

	public static void WaitList(int ticket) {
		
		Scanner sc=new Scanner(System.in);
		while(ticket>0 && !waitlist.isEmpty()) {
			
			System.out.println(waitlist.poll()+" Ticket Booked");
			ticket--;
		}
		 if (ticket > 0) {
	            System.out.println("Not enough employees for all tickets. Remaining tickets: " + ticket);
	        }
		
	}
	
	
}
