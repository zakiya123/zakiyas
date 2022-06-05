package classexcercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class T_Demo3
{
	public static void main(String[] args) {
		T_Demo3 obj=new T_Demo3();
		Thread t=Thread.currentThread();
//		System.out.println(t);
		obj.met1();
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new MYThread(obj));
		obj.met3();
		es.shutdown();
	}
	void met1() {
		System.out.println("met 1 called.....");
		Thread t=Thread.currentThread();
		System.out.println("met 1 called....."+t);

	}
	void met2() {
		try {Thread.sleep(5000);}catch(Exception e) {}

		System.out.println("met 2 called.....");
		Thread t=Thread.currentThread();
		System.out.println("met 2 called....."+t);

	}
	void met3() {
		System.out.println("met 3 called.....");
		Thread t=Thread.currentThread();
		System.out.println("met 3 called....."+t);

	}
	}
	class MYThread  implements Runnable{
		T_Demo3 obj;
		public MYThread(T_Demo3 obj) {
		this.obj=obj;
		}
		@Override
		public void run() {
			 Thread t=Thread.currentThread();
		obj.met2();
			
		}
	}

