package selfDemoCodes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo1 {
		public static void main(String[] args) {
			ExecutorService es=Executors.newFixedThreadPool(1);
			es.execute(new myThread());
			es.shutdown();
			try {
				Thread.sleep(4000);
			}catch(Exception e) {}
			for(int i=0;i<4;i++) {
				System.out.println("zak,zakuoo,zakii");
			
		}}
}
class myThread implements Runnable{
  void  met2() {
	 for(int j=0;j<=5;j++) {
		 for(int k=0;k<=5;k++)
		 System.out.print("*");
	 }
	 System.out.println();
 }
 public static  ThreadDemo1 met() {
	 System.out.println("static met callled");
 
    return null ;}
	@Override
	public void run() {
		System.out.println("child.....");
		met2();
		met();
	}
	
}