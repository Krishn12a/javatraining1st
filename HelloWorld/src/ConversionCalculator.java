import java.util.Scanner;

public class ConversionCalculator {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter The Conversion Name \n 1.Area \n 2.Length \n 3.Temperature");
		String name=input.next();
		switch (name) {
			//case 1
			case "Area":{
				System.out.println("Enter the conversion No_Type  \n 1.square foot to square meter \n 2.square meter to square foot");
				int no=input.nextInt();
					switch(no) {
					case 1:{
						System.out.print("Enter the sf : ");
						int sf=input.nextInt();
						double result=sf/10.764;
						System.out.println(result +" square meter");
						break;
					}
					case 2:{
						System.out.print("Enter the sm : ");
						int sm=input.nextInt();
						double result=sm*10.764;
						System.out.println(result +" square foot");
						break;
					}
					default:{
						System.out.println("Enter the number as it is shown");
					}
					}
					break;
				
			}
			//case 2
			case "Length":{
				System.out.println("Enter the conversion No_Type  \n 1.Inch to meter \n 2.meter to Inch");
				int no=input.nextInt();
					switch(no) {
						case 1:{
							System.out.print("Enter the inch no : ");
							int in=input.nextInt();
							double result=in*0.0254;
							int re=(int)result;
							double r1=(re-result)*100;
							System.out.println(re+"m "+r1+"cm");
							break;
						}
						case 2:{
							System.out.print("Enter the meter no : ");
							int mt=input.nextInt();
							double result=mt*39.37;
							System.out.println(result+" Inch");
							break;
						}
						default:{
							System.out.println("Enter the number as it is shown");
						}
					}
					break;
				
			}
			//case 3
			case "Temperature":{
				System.out.println("Enter the conversion No_Type  \n 1.Degree celsius to Fahreheit \n 2.Fahreheit to Degree celsius");
				int no=input.nextInt();
					switch(no) {
					case 1:{
						System.out.print("Enter the Decgree celsius no : ");
						double in=input.nextInt();
						double result=((in*9/5)+32);
						System.out.println(result +" Fahreheit");
						break;
					}
					case 2:{
						System.out.print("Enter the Fahreheit no : ");
						float in=input.nextInt();
						float result=((in-32)*5/9);
						System.out.println(result+ " Degree celsius");
						break;
					}
					default:{
						System.out.println("Enter the number as it is shown");
					}
					}

					break;
				
			}
	
		
		default:{
			System.out.println("Enter the name as it is shown");
		}
		}
		
	}

}