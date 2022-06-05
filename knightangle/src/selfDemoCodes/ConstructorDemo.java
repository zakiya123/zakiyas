package selfDemoCodes;

 public class ConstructorDemo {
		public static void main(String[] args) {
		Whale wale=new Whale(new Dinosur(10,"dinoo"));
		//Dinosur dinosur=new Dinosur();
		}
 }
 class Whale{//steps to call sub clss param in other class ie.call dinosur param in whale
	 Dinosur dino;//class name as complex variable then make instance of it
	 			//pass class name in whale class param then local variable
	public Whale(Dinosur dino) {
		this.dino=dino;//make instance and local same
		System.out.println("whale cons called.....");
	}
 }
 class Dinosur{
	public Dinosur() {
		System.out.println("Dinosur cons called....");
	}
	  Dinosur(int i,String s){//overloaded cons
		  System.out.println("cons with param called.....");
	  }
  }