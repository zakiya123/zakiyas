package knightangle;

public class ClassVariables {
		//\\My objective is to print complex variable
	   //  \\The class which you use as variable is known as class variable;;...
	  //  $ \\ie the class written by you is known as 
	 //      \\class variable;
	public static void main(String[] args) {
		TRoom room1 = new TRoom();		// first obj  of troom
		room1.sanyo=new  Projector();	//obj of class projector
		TRoom.indian= new Toilet();		//obj of class toilet
		System.out.println("Projector in Room1......"+room1.sanyo+":"+TRoom.indian);
		System.out.println("Hash code of Room1...."+room1.hashCode());//how to print hash code 
		
		TRoom room2 = new TRoom(); //second obj of troom
		room2.tplink=new Projector();
		System.out.println("Projector in room2......."+"\t"+room2.tplink+":*"+TRoom.indian);
	}
}
 class TRoom{
	 Projector sanyo,tplink;  //complex type variable/instance
	static Toilet indian;		//complex type
}
 class Projector{}
 
 class Toilet{}
	 
 