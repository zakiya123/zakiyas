package myproject;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {
			public static void main(String[] args) {
			ExecutorService es= Executors.newFixedThreadPool(1);
		    es.execute(new myWork());
            met1();
			met2();
		  //  met3();
			met4();
			es.shutdown();
			}
			static void met1() {
				System.out.println("customer 1 ...");
			}
			static int met2() {
				
				System.out.println("customer 2 called...");
				try {Thread.sleep(1000);
					
				}catch(Exception e) {
					
				}return 10;
			}
			static void met3() {
				System.out.println("customer 3 called...");
				for(int i=0;i<5;i++) {
					System.out.println(i);
				}
			}static void met4 (){
				System.out.println("zakiya.....");
			}
   }
class myWork implements Runnable{
	@Override
	public void run() {
		
		ThreadDemo4.met3();
		System.out.println("child....");
	}
}