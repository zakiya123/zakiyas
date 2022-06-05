package classexcercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class MyExecut_met2 implements Runnable{
String name;
	ThreadDemo2 t2;
	public MyExecut_met2(ThreadDemo2 t2,String name) {
		this.t2=t2;
		this.name=name;
	}
	@Override
	public void run() {
	Thread.currentThread().setName(name);
		t2.met3();
		
	}
}
public class ThreadDemo2 {
		public static void main(String[] args) {
			ThreadDemo2 t2=new ThreadDemo2();
			Thread z=Thread.currentThread();
	       z.setName("zak thread");
			z.setPriority(7);
			System.out.println(z);
			//t2.met1();
			ExecutorService es=Executors.newFixedThreadPool(1);
			es.execute(new MyExecut_met2(t2,"zural"));
			t2.met3();
			es.shutdown();
		}
		void met1() {
			System.out.println("met1 called...");
			Thread z =Thread.currentThread(); 
		String name=z.getName();
			System.out.println("met1 called..."+z+name);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
			}
		}
		void met2(){
//			try {
//			Thread.sleep(2000);
//		}catch(Exception e) {}
		
			System.out.println("met2 called...");
			Thread z=Thread.currentThread();
		String name=z.getName();
			System.out.println("met2 called..."+z+name);
			
		}
            void met3(){
//            	try {
//    			Thread.sleep(2000);
//    		}catch(Exception e) {
//    		}
			System.out.println("met 3 called....");
			Thread z =Thread.currentThread();
			String name=z.getName();
			System.out.println("met3 called..."+z+name);
		}
}
