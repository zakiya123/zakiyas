package laylademo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {
			public static void main(String[] args) throws Exception {
			ThreadDemo2 t2=new ThreadDemo2();
			t2.met1();
			t2.met3();
			ExecutorService zak=Executors.newFixedThreadPool(1);
			zak.execute(new mymet());
			}
			public void met1() throws Exception {
				System.out.println("met one called.....");
			Thread t=Thread.currentThread();	
				Thread.sleep(1000);}
			public void met2() {
				System.out.println("met two called.....");
			}public void met3() {
				System.out.println("met three called.....");
			}
}
class mymet implements Runnable {
ThreadDemo2 t2;
public void temp(ThreadDemo2 t2) {
	this .t2=t2;
}
	@Override
	public void run() {
		t2.met2();
		
	}
	
}