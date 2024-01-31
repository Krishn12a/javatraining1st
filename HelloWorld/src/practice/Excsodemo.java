package practice;

public class Excsodemo {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("code start");
			int [] arr=null;
			
			throw new NullPointerException("demo");
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			
		}

		
		System.out.println("code end");
	}

}
