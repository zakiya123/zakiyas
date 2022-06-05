package selfDemoCodes;
/*we can have class in class;
 * we have two types of innerclasses->static and non static
 * in nonstatic we have private and protected inner class;
 */

public class InnerOuterDemo1 {
		public static void main(String[] args) {
		//	Outer outer=new Outer();
			Outer.InnerStatic in=new Outer.InnerStatic();
			Outer.InnerNonStatic ins=new Outer().new InnerNonStatic();
		//	outer.out(5);
			in.met("goat");
			ins.met1();
			Outer2 o=new Outer2();
			o.met3();
		}
}
class Outer{
	void out(int v) {
		System.out.println("out met called....."+v);
	}static void outmet(){
		System.out.println("static void met of outer class.....");
	}
	static class InnerStatic{
		void met(String g) {
			System.out.println("met called..."+g);
			Outer.outmet();        
		}
	}
	class InnerNonStatic{
		void met1() {
			System.out.println("met1 called.......");
			out(6);
		}
	}
}
class Outer2{
	void met3() {
	class Local{//local inner class is private to the method.....
		void mett() {
			System.out.println("Local void met called....");
		
		}}
	new Local().mett();
}}