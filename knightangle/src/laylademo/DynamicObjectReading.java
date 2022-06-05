package laylademo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DynamicObjectReading {
		public static void main(String[] args) throws Exception {
			PolicStation p1=new PolicStation();
			Politician holyMan=new Politician();
			Talior karim=new Talior();
			//p1.arrest(holyMan);
			p1.arrest(karim);
		}
}
class PolicStation{
	public void arrest(Object o) throws Exception {
	Class c=o.getClass();//normal way of interrogation...
	Field f=c.getField("publicName");
	System.out.println(f.get(o));
	
	Method m=c.getMethod("service");
	m.invoke(o);
	
	m=c.getMethod("service", String.class,int.class);
	m.invoke(o,"mykidds",21121);
	}                                                 
 }                                                               
class Politician{
	public String publicName="noble..gold hearted...holy...saver of humanity...";//string variable
	public void service() {
		System.out.println("All noble service...");	
	}
	public void service(String name,int num) {
		System.out.println("overloaded service method....."+name+"....."+num);
	}
}
class Talior{
	public String publicName="Karimbhai";//string variable
	public void service() {
		System.out.println("making gentlemen ....dresses...");
	}
	public void service(String name,int num) {
		System.out.println("overloaded service method....."+name+"....."+num);
	}
}
