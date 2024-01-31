package practice;

import java.util.Scanner;
import java.util.*;

public class Exception {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=s.nextInt();
			int dv=num/0;
			System.out.println("inside the try block");
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic exceptin => "+e.getMessage());
		}
		
		catch(NullPointerException n) {
			System.out.println("nullpointer except : "+n.getMessage());
		}
//		catch(RuntimeException re) {
//			System.out.println(re.getMessage());
//		}
	}

}
