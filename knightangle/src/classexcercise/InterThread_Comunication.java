package classexcercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterThread_Comunication {
		public static void main(String[] args) {
	    Gun bofors=new Gun();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new GunOpretation(bofors,"ramu"));
		es.execute(new GunOpretation(bofors,"sham"));
		es.shutdown();
		}
}
class GunOpretation implements Runnable {
	Gun gun;String name;
	public GunOpretation(Gun gun,String name) {
		this.gun=gun;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		for(int i=0;i<5;i++) {
		if(name.equals("ramu")) {
		gun.fill();	
		}else if(name.equals("sham")){
			gun.shootgun();
		}
		}
		
	}
}
class Gun{
	boolean gunLoadedFlag;
 synchronized	public void fill() {
		
	if(gunLoadedFlag) {
		try {wait();
			
		}catch(Exception e) {}
	}String name=Thread.currentThread().getName();
		System.out.println("filling the gun..."+name);
		gunLoadedFlag=true;
		notify();
	}
	
 synchronized	public void shootgun() {
		if(!gunLoadedFlag) {
			try { wait();	
			}catch(Exception e) {}
		}
			String name=Thread.currentThread().getName();
			System.out.println("shootgun..."+name);
			gunLoadedFlag=false;
			notify();
		}
	}