package selfDemoCodes;

public class AbstractDemo {
			public static void main(String[] args) {
				Halll hall;//variable of class hall is creted to local variable;
				Halll.mett();
			int p=Halll.mettt();//calling retunable method
			System.out.println(p);//printing return value
				hall = new MarriageHalll();
				hall.met();
				//hall=new PartyHall();
				if(hall instanceof MarriageHalll) {
					System.out.println("this is a marriage hall.....");
				}
				hall=new PartyHall();
				if(hall instanceof PartyHall) {
					System.out.println("this is a party hall.....");
				}
				else {
					System.out.println("this is not a hall.....");
				}
				accept(new MarriageHalll());
				accept(new PartyHall());
				
			}
			static void accept(MarriageHalll halllll) {
			System.out.println("MarriageHall............"+halllll);	
			}
			static void accept(PartyHall hall) {
				System.out.println("PartyHall......"+hall);
			}
}
abstract class Halll{
	public Halll() {
		System.out.println("hall cons called....");
	}
	static {
		System.out.println("static block called....");
	}
	public void met() {
		System.out.println("void met called....");
	}
	static void mett() {
		System.out.println("static void met called....");
	}
	static int mettt() {
		System.out.println("return met called...");
	return 10;}

}
class MarriageHalll extends Halll{
	public MarriageHalll() {
		System.out.println("marriage hall cons called.....");
	}
}
class PartyHall extends Halll{
	public PartyHall() {
		System.out.println("Party hall cons called....");
	}
}