package MultiThreadigdemo;

class ThreadSequence  implements Runnable{

	int remainder;
	static int num=1;
	int limit =7;
	static Object Lock=new Object();
	public ThreadSequence (int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		
		while(num < limit) {
			synchronized (Lock) {
				while(num%2!=remainder)
				{
					try {
						Lock.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+" "+num);
				num++;
				Lock.notifyAll();
			}
		}
		
	}

}

public class OddEvenSequence {
	 public static void main(String[] args) {
			ThreadSequence odd_sequence = new ThreadSequence(1);
			ThreadSequence even_sequence = new ThreadSequence(0);

			System.out.println("Odd-Even Number Sequence Using Thread");
			
			Thread odd_thread = new Thread(odd_sequence,"0");
			Thread even_thread = new Thread(even_sequence,"1");
			
			
			odd_thread.start();
			even_thread.start();

			
		}
}
