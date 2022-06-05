package classexcercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//One object-two threads and two task.object lock is alsoknown as pesimestic lock
public class ObjectLock {
		public static void main(String[] args) {
		ReservationCounter counter=new ReservationCounter();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new mywork(counter,"zak",1000));
		es.execute(new mywork(counter,"zakoo",2000));
		es.shutdown();
		}				
}
class mywork implements Runnable {
	ReservationCounter central;String name;int amt;
	public mywork(ReservationCounter central,String name,int amt) {
		this.central=central;
	    this.name=name;
	    this.amt=amt;
	}
	@Override
	public void run() {
	Thread.currentThread().setName(name);
	synchronized(central) {        
	central.bookticket(amt);
	central.getchange();
	}
}}
class ReservationCounter{
	int amt;
public	void bookticket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("TicketBooked by...."+name+"....amount is..."+amt);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
	}
	void getchange(){
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("change given to...."+name+"....amount is..."+(amt-100));
	}
}