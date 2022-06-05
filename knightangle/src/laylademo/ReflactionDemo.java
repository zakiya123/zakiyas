package laylademo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflactionDemo {
	public static void main(String[] args) throws Exception {
     PoliceStation p1=new PoliceStation();
     Politician1 chor=new Politician1();
     p1.intro(chor);
}}
class PoliceStation{
 public void intro(Object o) throws Exception {
	 Class c=o.getClass();//static way of invocation.
	 Field f=c.getField("myname");
	 System.out.println(f.get(o));
	 
	 f=c.getDeclaredField("SecretName");//dynamic way of invocation.
	 f.setAccessible(true);
	 System.out.println(f.get(o));
	 
	Method m=c.getDeclaredMethod("SecretService");
	m.setAccessible(true);
	m.invoke(o);
 }      
}
class Politician1{
    public String myname="zulu";
	private String SecretName ="Baburao";
	private void SecretService() {
	System.out.println("my secret method of fooling....");	
	}
}