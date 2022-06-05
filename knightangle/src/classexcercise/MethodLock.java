package classexcercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodLock {
		public static void main(String[] args) {
			CouncellingHall Ch=new CouncellingHall();
			ExecutorService es=Executors.newFixedThreadPool(3);
			es.execute(new mymet(Ch, " t1..mohan"));
			es.execute(new mymet(Ch, "t2..master"));
			es.execute(new mymet(Ch, "t3..Imran"));
		}
}class mymet implements Runnable{
	CouncellingHall hall;String name;//class name+instance
	public mymet(CouncellingHall hall,String name) {
	this.hall=hall;
	this.name=name;
	}
	@Override
	public void run() {
	Thread.currentThread().setName(name);
	synchronized (CouncellingHall.class) {
	if (name.equals("me")){
	hall.water();
	hall.table1();
	hall.table2();
	hall.table3();
	}else {
		hall.table1();
		hall.table2();
		hall.table3();
	}
	}
}}
class CouncellingHall{
	synchronized public void table1() {
	String name=Thread.currentThread().getName();	
	System.out.println(name+"...is at table one");	
	}synchronized public void table2() {
		String name=Thread.currentThread().getName();	
		System.out.println(name+"...is at table two");	
		
	}synchronized public void table3() {
		String name=Thread.currentThread().getName();	
		System.out.println(name+"...is at table three");	
		
	} public void water() {
		String name=Thread.currentThread().getName();	
		System.out.println(name+"...is drinking water...");	
	}
}