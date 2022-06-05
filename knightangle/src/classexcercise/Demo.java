package classexcercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
		public static void main(String[] args) {
			one obj=new one();
			ExecutorService es=Executors.newFixedThreadPool(1);
			es.execute(new onejob());
			
			one.met1();
			one.met2();
			one.met3();
			es.shutdown();
		}	
}
class one{
	static void met1() {
		System.out.println("one met called....");
	}
	static void met2() {
		System.out.println("two met called....");
		try {Thread.sleep(1000);
		}catch(Exception e) {}
	}
	static void met3() {
		System.out.println("three met called....");
	}
}
class onejob implements Runnable{
	@Override
	public void run() {
		one.met3();
		System.out.println("child called....");
	}
}