package shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Maincl {
	static ArrayList<Product>pr=new ArrayList<Product>();
	static ArrayList<ShoppingCart> sp=new ArrayList<ShoppingCart>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String con="";
		Product p1=new Product("Mobile", 10000);
		Product p2=new Product("Tv", 25000);
		Product p3=new Product("Camera", 50000);
		pr.add(p1);
		pr.add(p2);
		pr.add(p3);
		do {
			System.out.println("\t\t\tWelcome to Electronics shop");
			System.out.println("\n\n1.List of products\n2.Add to cart\n3.update the cart\n4.remove products in cart\n5.Exit");
			System.out.println("Enter the options : ");
		
			int opt=sc.nextInt();
			switch (opt) {
			case 1:{
				try {
					showProduct();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				}	break;
			case 2:{
				try {
					addproduct();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}break;
			case 3:{
				try {
					updateCart();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}break;
			case 4:{
				try {
					removeProduct();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}break;
			case 5:{
				
				System.out.println("\n\n\n\t\t\tTHANK YOU FOR SHOOPING");
				cart();
			}break;
			default:
				System.out.println("Enter the number as shown in above");
			
			}
			System.out.println("\n\nDo you want to go to Main menu ?type y/n : ");
			con=sc.next();
		}while(con.equalsIgnoreCase("y"));
		cart();
		
		
		
	}
	public static void showProduct() {
		Iterator<Product> it=pr.iterator();
		while (it.hasNext()) {
			Product pro =  it.next();
			System.out.println("product id : "+pro.id+"\tproduct name : " +pro.pname+"\tproduct Price : "+pro.price);
			
		}
	}
	public static void addproduct() {
		String con ="";
		showProduct();
		
			do {
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the id : ");
				int sid=sc.nextInt();
				for (int i=0;i<=pr.size()-1;i++) {
					
					if(sid==pr.get(i).id ) {
						System.out.println("Enter the qty : ");
						int cqty=sc.nextInt();
						ShoppingCart cart=new ShoppingCart(pr.get(i).pname, pr.get(i).price, cqty);
						sp.add(cart);
						cart();
						break;
					}
					
					
				}
				System.out.println("Do you want to add another product : Type(y/n) ");
				 con = sc.next();
			} while (con.equalsIgnoreCase("y"));
				
			
	}
	public static void cart() {
		Iterator<ShoppingCart> sp1=sp.iterator();
		int sno=1;
		while(sp1.hasNext()) {
			ShoppingCart spc=sp1.next();
			System.out.println("serial no : "+sno+"\tproduct name : " +spc.pname+"\tQuantity : "+spc.qty+"\tTotal Price : "+spc.price);
			sno++;
		}
	}
	public static void updateCart() {
		
		cart();
		String con ="";
			do {
				Scanner sc=new Scanner(System.in);
				
				for(int i=0;i<=sp.size()-1;i++) {
					System.out.println("Enter the Productname : ");
					String uname=sc.next();
					if(uname.equalsIgnoreCase(sp.get(i).pname)) {
						
						System.out.println("Enter the qty : ");
						int qty=sc.nextInt();
						ShoppingCart cart=new ShoppingCart(pr.get(i).pname, pr.get(i).price, qty);
						
						sp.add(cart);
						sp.remove(i);
						
						cart();
						break;
					}
					else {
						System.out.println("Enter the valid name : ");
					}
				}
				System.out.println("Do you want to update another product : Type(y/n) ");
				 con = sc.next();
			} while (con.equalsIgnoreCase("y"));
			
		
	}
	public static void removeProduct() {
		cart();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the productName to remove : ");
		String uname=sc.next();
		for (int i = 0; i <=sp.size()-1; i++) {
			if(uname.equalsIgnoreCase(sp.get(i).pname)) {
				sp.remove(i);
				cart();
			}
			else {
				System.out.println("Enter the valid name");
			}
		}
	}
	
	
}
	
