package classexcercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo6 {//DeathLock
			public static void main(String[] args) {
				Crane crane=new Crane();
				Frog frog= new Frog();
			ExecutorService es=Executors.newFixedThreadPool(2);
			es.execute(new DeathLockJob(crane, frog, "crane"));
			es.execute(new DeathLockJob(crane, frog, "frog"));
			es.shutdown();
			}         
}
class DeathLockJob implements Runnable{
	Crane c;Frog f;String name;
	public DeathLockJob(Crane c,Frog f,String name) {
		this.c=c;
		this.f=f;
		this.name=name;
	}
	@Override
	public void run() {
	Thread.currentThread().setName(name);	
	if(name.equals("crane")) {
		c.eat(f);
	}else if(name.equals("frog")) {
		f.escape(c);
	}
	}
}
 class Crane {
 synchronized	public void eat(Frog f) {
		System.out.println("swaahaa.....");
		f.leaveCrane();
	}
 synchronized	public void leavefrog() {
		System.out.println(">>>>>>>>>>>>>>>>>>>@@@@@@@@@@@@@@@@");
	}
}
 class Frog{
	synchronized	public void escape(Crane c) {
		System.out.println("dead.......");
		c.leavefrog();
	}
	synchronized	public void leaveCrane() {
		System.out.println(">>>>>>>>>>>>>");
	}
}
