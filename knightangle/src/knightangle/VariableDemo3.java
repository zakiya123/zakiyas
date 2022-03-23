package knightangle;

public class VariableDemo3 {
	//$$$ My objective is to print static variable/class variables
	//static fields can be directly access,you don't need to create an instance.
	//of the class ,because JVM instantiates all static fields and static method.
	//static fields/variable are shared by multiple instance of the class.
	public static void main(String[] args) {
		TraningRoom.Toilet="indian toilet"; //you can call class variable directly without creating its obj
		System.out.println(TraningRoom.Toilet);
		TraningRoom room1=new TraningRoom();
		room1.Projector="sanyo";	
		TraningRoom.Toilet="western";//first instance initialization;
		
		
		TraningRoom room2 = new TraningRoom();
		room2.Projector="huwai";		
		TraningRoom.Toilet="indian";//changed instance
		
		System.out.println(room1.Projector+":"+TraningRoom.Toilet);
		System.out.println(room2.Projector+":"+TraningRoom.Toilet);
		
	}
}
class TraningRoom{
	String Projector;//instance variable
	static String Toilet;		//class variable
}
