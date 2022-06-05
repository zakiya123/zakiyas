package laylademo;

public class LaylaDemoMySingleTon {
	public static void main(String[] args) {
		
	
		mysingleton obj=mysingleton.createObject();
		mysingleton.createObject();
		mysingleton.createObject();
		mysingleton.createObject();
	
}}
class mysingleton{
	private mysingleton() {
	System.out.println("cons called....");	
	}
	private static mysingleton obj;
	public static mysingleton createObject() {//factory method.
		if(obj==null) {
			obj=new mysingleton();
		}
		return obj;
	}
}