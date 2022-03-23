package classexcercise;
      
public class HelloWorld1 {
//		int i=5;  //instance variable
//		static int c=4;
	public static void main(String[] args) {
		complexvariable room1=new complexvariable();
		room1.table=new table();
		complexvariable.wifi=new wifi();
		System.out.println("My Room..."+room1.table+"::"+complexvariable.wifi);
//	System.out.println("HelloWorld....");
//	HelloWorld1 salim =new HelloWorld1();
//	salim.yusuf();
//	System.out.println("Local variable"+":"+c);
//		HelloWorld1 ab= new HelloWorld1();
//		ab.i=3;
//		salim.i=12;
//		System.out.println("changed instance"   +salim.i+":"+ab.i);
	}
//		void yusuf() {
//			int i=2;
//			System.out.println(i+":"+c);
//			System.out.println(this.i+":"+i);
//		System.out.println(i);
//		}
}
class complexvariable{
	table table;
	static wifi wifi;
}
class table{
	
}
class wifi{
	
}
