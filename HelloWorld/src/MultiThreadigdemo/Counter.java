package MultiThreadigdemo;

public class Counter extends Thread {
	
		private int threadNo;
		public Counter(int threadNo) {
			this.threadNo = threadNo;
		}
		@Override
		public void run() {
			countMe();
		}
		
		public void countMe() {
			
			for (int i=1;i<5;i++) {
				try {
					sleep(500);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("Thread No : " +threadNo + "and iteration No" +i);
			}
		}
		public class MultiThreadDemo {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
				Counter c1 = new Counter(1);
				Counter c2 = new Counter(2);

				long startTime = System.currentTimeMillis();
				c1.start();
				System.out.println("******************************************");
				c2.start();
				Thread.sleep(5000);
				long endTime = System.currentTimeMillis();
				

			}

	}
	}

	
