package practice;

public interface caompany {
	
	void getaddress();
	void getcon();
	default void getemail(String...dname) {
		System.out.println("Dept list");
		for(String dt:dname) {
			System.out.println(dt);
		}
	}

}
