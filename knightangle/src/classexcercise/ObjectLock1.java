package classexcercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObjectLock1 {
		public static void main(String[] args) {
			ReservationCounter1 rc=new ReservationCounter1();
			ExecutorService es=Executors.newFixedThreadPool(2);
			Thread t=Thread.currentThread();
			t.setName("madgirl");
			System.out.println(t);
			es.execute(new BookingCounter(rc, "bewafa", 120));
			es.execute(new BookingCounter(rc, "bewaqoof", 123));
			es.shutdown();
//			rc.bookticket(200, "mad");
//			rc.givemoney( "bad",100);
		}
}
class ReservationCounter1{
	int amt;
	public void bookticket(int amt) {
		this.amt=amt;
	Thread t=Thread.currentThread();
	String name=t.getName();
		System.out.println("Ticket booking...."+name+"....your ticket...."+amt);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}	
		}
	public void givemoney() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		
		System.out.println(name+"...your change....."+(amt-50));
	}
}
class BookingCounter implements Runnable{
	ReservationCounter1 counter;String name;int amt;
	public BookingCounter(ReservationCounter1 counter ,String name,int amt) {
		this.counter=counter;
		this.name=name;
		this.amt=amt;	
	}
	@Override
	public void run() {
		synchronized(counter) {
		Thread.currentThread().setName(name);
		counter.bookticket(amt);
		counter.givemoney();
	}}
}