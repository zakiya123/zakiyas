package myproject;

 class ADemo {
	
		int i,j;
		void Showij() {
			System.out.println("i and j" +i+""+j);
		}
	}
	class B extends ADemo{
		int k;
		void showk() {
			System.out.println("k:" +k);
		}
		void sum() {
			System.out.println("i+j+k:" +(i+j+k));
		}
	}
public class SimpleInheritence{
	public static void main(String args[]) {
		ADemo superOb = new ADemo();
		B subOb = new B();
		// The superclass may be used by itself.
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of superOb: ");
		superOb.Showij();
		System.out.println();
		/* The subclass has access to all public members of
		its superclass. */
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb: ");
		subOb.Showij();
		subOb.showk();
		System.out.println();
		System.out.println("Sum of i, j and k in subOb:");
		subOb.sum();
		}
		}

