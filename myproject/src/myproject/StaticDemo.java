package myproject;

class Parent{
	int i=20;
	static void met(int i) {
		System.out.println("parent met is called...."+i);
	}
}
public class StaticDemo extends Parent {
			public StaticDemo() {
			System.out.println("cons called...");	
			}
static {
	System.out.println("code common for all static methods is written here..");
	
}
public static void main(String[] args) {
	// new StaticDemo().met2();
	Parent.met(200);
	StaticDemo.met(100);
	//StaticDemo.met();
}
int i=100;
	static void met(int i) {
		System.out.println("static method called......."+i);
	}
	static void met() {
		System.out.println("static method 222 called.....;");
	new StaticDemo().i=20;
	//i=10;
	//met2();
	//System.out.println(i);
	}
	
	void met2(int i) {
		System.out.println("non static method called....");
		System.out.println(i);
	}
			}
