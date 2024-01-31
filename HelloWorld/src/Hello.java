import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		int feb1=29;
//		String leapyear;
//		leapyear=(feb1 == 29)?"it is leap year":"it si naot a leapyear";
//		System.out.println(leapyear);
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your number : ");
		int feb=input.nextInt();
		String leapyear = (feb == 29)?"it is leap year":"it si naot a leapyear";
		System.out.println(leapyear);
		input.close();

	}

}
