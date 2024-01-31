import java.util.Arrays;
import java.util.Scanner;

public class RockPaper {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("..............welcome to rock paper game............");
		System.out.println("Enter the Option \n 1.Rock \n 2.Paper \n 3.Scisor");
		String con="";
		int count=0;
		int draw=0;
		
		int p1=0;
		int p2=0;

		
		do{
			System.out.println("Enter player 1 option :");
			String player1=input.next();
			System.out.println("Enter player 2 option :");
			String player2=input.next();
			
			if(player1.equals("Rock") && player2.equals("Paper")) {
			
				System.out.println("player 2 wins");
				p2++;
				
			}
			else if (player1.equals("Paper") && player2.equals("Rock")) {
				System.out.println("player 1 wins");
				p1++;
				
			}
			else if (player1.equals("Paper") && player2.equals("Scisor")) {
				System.out.println("player 2 wins");
				p2++;
				
			}
			else if (player1.equals("Scisor") && player2.equals("Paper")) {
				System.out.println("player 1 wins");
				p1++;
			}
			else if (player1.equals("Rock") && player2.equals("Scisor")) {
				System.out.println("player 1 wins");
				p1++;
			}
			else if (player1.equals("Scisor") && player2.equals("Rock")) {
				System.out.println("player 2 wins");
				p2++;
				
			}
			else if (player1.equals("Scisor") && player2.equals("Scisor")) {
				System.out.println("Match draw");
				draw++;
			}
			else if (player1.equals("Rock") && player2.equals("Rock")) {
				System.out.println("Match draw");
				draw++;
			}
			else if (player1.equals("Paper") && player2.equals("Paper")) {
				System.out.println("Match draw");
				draw++;
			}
			
			else {
				
				System.out.println("Please Enter The Correct Spelling");
				
			}
			
			System.out.println("Do yo want to continue \n 1.yes \n 2.no");
			con=input.next();
		}while(con.equals("yes"));
		System.out.println("..............Game status............. \nMatch Draw : "+ draw +" Times \nPlayer 1 win : "+p1+" Times \nPlayer 2 win : "+p2+" Times");
		
		
		
		
		
		
		
		
	}
	

}
