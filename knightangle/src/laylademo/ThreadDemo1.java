package laylademo;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

public class ThreadDemo1 {
		public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(1);
		ThreadDemo1 td1=new ThreadDemo1();
		es.execute(new myjob());
		Thread t=Thread.currentThread();
		t.setName("zaki");
		t.setPriority(6);
		System.out.println(t);
		//
		ThreadDemo1.eatlunch();
		}
		public static void eatlunch() {
			System.out.println("please come for lunch.....");
		}
}
class myjob implements Runnable{

	@Override
	public void run() {
		ThreadDemo1.eatlunch();
	System.out.println("success child thread of my job......");		
	}
}