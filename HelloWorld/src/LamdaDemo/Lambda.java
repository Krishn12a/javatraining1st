package LamdaDemo;

public interface Lambda {
	void marker();
}

class Main{
	public static void main(String[] args) {
		Lambda lamb=()->System.out.println("jhvbjhf");
		lamb.marker();
	}
}
