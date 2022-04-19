package myproject;

public class ClassesAndObject {
				public static void main(String[] args) {
				Car mycar=new Car();
				System.out.println("Gear...:"+mycar.getGear());
				mycar.changeGear();
				mycar.changeGear();
				//mycar.changeGear();
				//mycar.changeGear();
				System.out.println("Gear..:"+mycar.getGear());
				}
}
class Car{
		int gear=0;
		public void changeGear() {
		if(gear==0) {
			gear=1;
		}
		else if(gear==1) {
			gear=2;
		}
		else if(gear==2) {
			gear=3;
		}
		else {
			gear=0;
		}}
		public int getGear() {
			return gear;
		}
}