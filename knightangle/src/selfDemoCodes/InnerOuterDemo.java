package selfDemoCodes;

public class InnerOuterDemo extends Child{
	int i=9;
	public InnerOuterDemo() {
		System.out.println("cons called...........");
	}
		public static void main(String[] args) {
			InnerOuterDemo.met();
			InnerOuterDemo.met1();
			InnerOuterDemo.met2();
		InnerOuterDemo obj=	new InnerOuterDemo();
			obj.met3(45);
		}
		static {
			System.out.println("codes common for static met called.....");
		}
		static void met() {
			System.out.println("static met called...");
		new	InnerOuterDemo().i=76;//instance i is called in static method..
		}
		static void met1() {
			System.out.println("static met1 called...");
		}
		static void met2() {
			System.out.println("static met2 called....");
		}
		void met3(int i) {
			System.out.println(this.i+":::::::"+i);
			System.out.println(super.i+":::::::"+i);
		}
} 
class Child {
	int i=6;
}
                                                                    