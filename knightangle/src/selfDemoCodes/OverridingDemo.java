package selfDemoCodes;

public class OverridingDemo {
	public static void main(String[] args) {
		
	
//		Hall hall= new MarriageHall();
//		hall.met();	
		MarriageHall  mh=new MarriageHall();
		mh.met();
		BirthdayHall bh=new BirthdayHall();
		bh.all();
}}
class Hall{
	protected void met() {
		System.out.println("Royal feast....:");
	}
}
class MarriageHall extends Hall{
	
	public  void met() {
		System.out.println("Marriage Feast..........");
		super.met();
	}
}
class BirthdayHall extends Hall{
	public void all() {//template methods....
		System.out.println("birthday....:");
		met();
		super.met();
	}
}