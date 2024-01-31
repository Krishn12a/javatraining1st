package MultiThreadigdemo;


class Brackets{
	public void generateS() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				if(i<=5) {
					System.out.print("[");
					
				}
				else {
					System.out.print("]");
					
				}
			}
			System.out.println();
		}
	}
	
	public void generateC() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				if(i<=5) {
					System.out.print("{");
				}
				else {
					System.out.print("}");
				}
			}
			System.out.println();
		}
	}
}
public class GenerateBrackets {
	public static void main(String[] args) {
		Brackets bracket = new Brackets();
		new Thread(new Runnable() {
			public void run(){
				bracket.generateC();
				bracket.generateS();
			}
		}).start();
		
//		new Thread(new Runnable() {
//			public void run(){
//				
//				
//			}
//		}).start();
		
		Thread th=new Thread(()->{
			bracket.generateC();
			bracket.generateS();
		});
		th.start();
		

}}
