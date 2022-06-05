package selfDemoCodes;

public class DoWhileDemo {
	public static void main(String[] args) {
	DoWhileDemo dwd=new DoWhileDemo();
	dwd.met();
	dwd.met(1.2f, 333.44);
	dwd.met(23, "kite");
	dwd.met3();
	
	int f=DoWhileDemo.met1();
	System.out.println(f);
	
	int g=DoWhileDemo.met1(5);
	System.out.println(g);
	DoWhileDemo.method();
	int y=6;
		do {
			System.out.println(y);y++;
		}while(y<10);
		//method overloading......
		
 } void met(){
	System.out.println("met called....");
 }
 void  met(int i,String k) {
	System.out.println("met with parameter called....");
 }
 void met(float f,double d) {
	System.out.println("decimal parameter called");
 }
  int met3() {
	 System.out.println("no");return 4;
 }
  static int  met1() {
	System.out.println("static met called....");
	return 5;
			
  }
  static int  met1(int i) {
	System.out.println("static met parameter called....");
	return 10;		
  }	
  static void method() {
	 System.out.println("yeeehhhhhaappp");
 }
	}
