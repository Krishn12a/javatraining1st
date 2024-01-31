package shop;

public class Product {
	static int pid=1;
	int id;
	String pname;
	int price;
	
	public Product(String pname,int price) {
		this.id=pid++;
		this.pname=pname;
		this.price=price;
		
	}
	

}
