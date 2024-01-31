package shop;

public class ShoppingCart {
	int pid=0;
	int id;
	String pname;
	int price;
	int qty;
	public ShoppingCart(String pname,int price,int qty) {
		this.id=pid++;
		this.pname=pname;
		this.price=price*qty;
		this.qty=qty;
	}

}
