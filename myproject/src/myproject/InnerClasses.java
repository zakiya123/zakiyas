package myproject;

public class InnerClasses {
		public static void main(String[] args) {
			Outer.InnerStatic ins=new Outer.InnerStatic();
			ins.met();
			Outer.InnerNonStatic in=new Outer().new InnerNonStatic();
			in.met();
		}
}
class Outer{
	void outMet() {
		System.out.println("non static method called......");
	}
	static void staticOutmet() {
		System.out.println("static void out met called.....");
	}
	static class InnerStatic{
		public void met() {
			System.out.println("static inner class method called...");
		//	outMet();non static cannot be accessed
			staticOutmet();
		}
	}
	class InnerNonStatic{
		public void met() {
			System.out.println("non static met called....");
			outMet();
			staticOutmet();
		}
	}
}