package knightangle;

public class StaticDemo {
			public static void main(String[] args) {
			DemoStatic.king(10);	       //static variable,,,,parameter is assigned
			DemoStatic  people= new DemoStatic();
			people.queen("gold");//normal method called...
			DemoStatic.king(10);//?
			people.queen("Dimond");//?
			}
}
class DemoStatic{
	int money;//instance variable
	static int honey;
	void queen(String ring) {
		 
		System.out.println("normal method called..."+honey+"::"+ring);//
		
	}
	static void king(int honey)  {//local variable
		DemoStatic.honey=honey;//static variable are access by class name.the reason of this line is to make
		//instance variable accessable...ie static int honey.
		
		//instance variable accepts parameters so that it can be use by other methods also ie in line no17 
		//the local method(void queen) will get honey only when the static method will be called 
		//otherwise local method
		//will not get honey..
		
		System.out.println("static method called...."+honey);
	}
}