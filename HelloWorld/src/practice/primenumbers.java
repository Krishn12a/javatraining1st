package practice;

public class primenumbers {
	static boolean isprime(int n) {
		if(n%1==0 && n%n==0) {
			return isprime(n-1);
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		int number=7;
		boolean result =isprime(number);
		if(result==isprime(number)) {
			System.out.println("is prime");
		}
		else
		{
			System.out.println("is not prime");
		}
	}

}
