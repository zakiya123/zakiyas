package knightangle;

public class ComplexTypeDemo {
		public static void main(String[] args) {
		
			TraningRooms.Toilets= new Toilets();	
		TraningRooms room1=new TraningRooms();
		room1.projectors =new Projectors();
		room1.learn(new Notepad());
		room1.learn(new Notepad());
		room1.learn(new Notepad());
		room1.learn(new Notepad());
		room1.learn(new Notepad());
		
		//Toilet Western=new Toilet();
		
		TraningRooms room2= new TraningRooms();	
		room2.projectors = new Projectors();
	//	Toilet indian=new Toilet();
		
		TraningRooms room3= new TraningRooms();	
		//System.out.println(room3+":"+TraningRooms.Toilets);
		//Projector sanyo = new Projector();
		//Toilet Western=new Toilet();
		
		System.out.println(room1.projectors+":"+TraningRooms.Toilets);
		System.out.println(room2.projectors+":"+TraningRooms.Toilets);
		System.out.println(room3.projectors+":"+TraningRooms.Toilets);
		}
		
		
}
class TraningRooms{
	Projectors projectors; //instance variable     complex type
	static	Toilets Toilets; //complex variable
	void learn(Notepad n) {//local variable...
	//everytime you run a program one notepad copy is created
	
	System.out.println(n);}
}
class Notepad{}
class Projectors{
	
}
class Toilets{
	
}