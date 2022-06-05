package classexcercise;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
		public static void main(String[] args)throws Exception {
			
			ExecutorService  es=Executors.newFixedThreadPool(1);
			es.execute(new MyThreadJob());
			//Thread t=Thread.currentThread();
			//System.out.println(t);
			for(int i=0;i
					<5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			es.shutdown();
		}
}
class MyThreadJob implements Runnable{
	@Override
	public void run() {
		System.out.println("child class logic goes here...");
		
	}
}
