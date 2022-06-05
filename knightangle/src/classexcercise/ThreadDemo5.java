package classexcercise;

import java.util.concurrent.Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo5 {
		public static void main(String[] args) throws Exception {
		ExecutorService ea  = Executors.newFixedThreadPool(1);
		
		Future<String> myfuture=ea.submit(new mycall());
		System.out.println(myfuture.get());
//		String r=myfuture.get();
//		System.out.println(r);
		System.out.println("main thred running...");
		int arr[]= {4,5,7};
		for(int f:arr) {
			System.out.println(f);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
		String r=myfuture.get();
		System.out.println(r);
		}
}
class mycall implements Callable<String>{
	@Override
	public String call() throws Exception {
		System.out.println("my call called....");
		return "salz";
	}
}
