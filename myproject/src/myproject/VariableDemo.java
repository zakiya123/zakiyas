package myproject;

public class VariableDemo {
		public static void main(String[] args) {
		VariableDemo obj= new VariableDemo(); 
		Laddu laddu =new Laddu();
		
		System.out.println("Befor passing value"+laddu.size);
		obj.pbv(laddu.size);
		System.out.println("After passing value"+laddu.size);
		
		
		System.out.println("Reference Befor passing value"+laddu.size);
		obj.pbr(laddu);
		System.out.println("Reference After passing value"+laddu.size);
		
		}
		
		void pbv(int size) {
			 size=5;
		}
		void pbr(Laddu lad) {
			lad.size=5;
		}
}
		
class Laddu{
	int size = 10;
}