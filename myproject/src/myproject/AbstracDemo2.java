package myproject;

public class AbstracDemo2 {
		public static void main(String[] args) {
		Hall1 hall;//you can create an instance of hall
		//but you cannot create an obj of abstract class
		//hall=new hall;
		Hall1.metS();
		hall = new PartyHall();
		hall.met();
		if(hall instanceof PartyHall) {
			System.out.println("this is party hall now.....");
			
		}
		hall=new MeetingHall();
		hall=new PartyHall();
		if(hall instanceof MeetingHall) {
			System.out.println("yes this is meeting hall now....");
		}else {
			System.out.println("this is not a meeting hall.....");
		}
		accept(hall);
		accept(new MeetingHall());
		}
		static void accept(Hall1 hall) {
			System.out.println("party............"+hall);
		}
		static void accept(MeetingHall hall) {
			System.out.println("meeting........"+hall);
		}
}
abstract class Hall1{
	public Hall1() {
		System.out.println("cons of abs called....");
	}
	static {
		System.out.println("static block of abs called....");
	}
	public void met() {
		System.out.println("abstract class met....");
	}
	public static void metS() {
		System.out.println("static met of abs called....");
	}}
class PartyHall extends Hall1{//party hall is a kind of hall
	public PartyHall() {
		System.out.println("party hall cons called....");
	}
}
class MeetingHall extends Hall1{
	public MeetingHall() {
		System.out.println("meeting hall cons called.....");
	}
}


