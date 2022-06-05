package myproject;

import java.util.Scanner;

public class ReflactionDemo {
			public static void main(String[] args) throws Exception  {
			//Temp temp=new Temp();static  you cannot change at runtime
		//step1	Temp temp=(Temp)Class.forName("myproject.Temp").newInstance();//dynamic
		//another way
				Scanner scan=new Scanner(System.in);
				System.out.println("please enter hall class name...");
				String className=scan.next();
				Haall temp=(Haall)Class.forName(className).newInstance();
			//myproject.temp is a string which we can change at runtime.
			System.out.println(temp);
			}
}
class Temp{
	
}
abstract class Haall{
	public abstract void usehall();
}
class MariageHall extends Haall{
	@Override
	public void usehall() {
	System.out.println("using hall for marriage.......");	
		
	}
}
class MeetingHaall extends Haall{
	@Override
	public void usehall() {
	System.out.println("using hall for meeting");	
		
	}
}
