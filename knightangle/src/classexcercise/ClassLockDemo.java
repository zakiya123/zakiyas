package classexcercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
		
 public class ClassLockDemo {
		public static void main(String[] args) {
		ClassLock CL =new ClassLock();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new Myclass(CL,"sonam",500));
		es.execute(new Myclass(CL,"raju",110));	
		es.shutdown();	
			}                 
       }                         
 class Myclass implements Runnable {
	ClassLock cl;String name;int amt;
	public Myclass(ClassLock cl,String name,int amt) {
	this.cl=cl;
	this.name=name;
	this.amt=amt;
	}                       
	@Override
	public void run() {	
	Thread.currentThread().setName(name);
	synchronized(ClassLock.class) {
	ClassLock.met1(amt);
	ClassLock.met2();
	}
}}
 class ClassLock {
	static int ii;
	public static void met1(int i) {ii=i;
		String name=Thread.currentThread().getName();
		System.out.println("Met1 called by..."+name+"...."+i);
		try { Thread.sleep(1000);	
		}catch(Exception e) {}	
		}
	public static void met2() {
		String name=Thread.currentThread().getName();
		System.out.println("Met2 called by..."+name+"...."+(ii-100)+"---value of ii");
	}
  }