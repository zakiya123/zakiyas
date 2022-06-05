package selfDemoCodes;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadCallableDemo {
			public static void main(String[] args) throws Exception {
				ExecutorService es=Executors.newFixedThreadPool(1);
			mywork zaki=new mywork();
			zaki.heatoil();
		Future <String>f=es.submit(new myjob()); 
			
				try{Thread t=Thread.currentThread();
				
				Thread.sleep(2000);
			}catch(Exception e) {}
			zaki.cooking();
			f.get();
			System.out.println(f.get());
			}
}
class myjob implements Callable<String>{
   public myjob() {
	
}
	@Override
	public String call() throws Exception {
		mywork zaki=new mywork();
	zaki.SabzeCutting();
	zaki.OnionCutting();
	zaki.TomatoCutting();
		System.out.println("zaki saying....khana ready......");
		return "my sabzi is healthy";
	}
	
}
class mywork{
	public void heatoil() {
		System.out.println("zak is heating oil...");	}
	void SabzeCutting() {
		System.out.println("dadi saying....ye le sabze saaf hogai.....");
	}
	void OnionCutting() {
		System.out.println("yusuf saying.... ammijan bhaji lo ..dadi diye.....");
	}
	void TomatoCutting() {
		System.out.println("abdu ammi mein pakau??.....");
	}
	void cooking() {
		System.out.println("chalo baccho khana kha looo....");
	}
}