package Students;

import java.util.Scanner;

public class ResultDetails {
	public static void main(String[] args) {
		StudentDetails s=new StudentDetails();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student First Name : ");
		s.setFname(sc.next());
		System.out.print("Enter Student Last Name : ");
		s.setLname(sc.next());
		System.out.print("Enter Student Gender : ");
		s.setGender(sc.next());
		System.out.print("Enter Student java mark : ");
		s.setJava(sc.nextInt());
		System.out.print("Enter Student Web mark : ");
		s.setWeb(sc.nextInt());
		System.out.print("Enter Student Database mark : ");
		s.setDtabase(sc.nextInt());
		s.result();
		
	
	}
}
