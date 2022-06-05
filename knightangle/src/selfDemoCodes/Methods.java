package selfDemoCodes;

public class Methods {
			public static void main(String[] args) {
			Methods myFood=new Methods();
			Lunch myLunch=myFood.cookhealthy();
			System.out.println(myLunch);
			System.out.println(myFood.marketing);
			int f=myFood.getBalanceMoney();
			System.out.println(f);
			System.out.println(myFood.getBalanceMoney());
			dal();
			myFood.makerice();
			myFood.LunchReady();
			}
			int money=500;
			String Food;
			boolean marketing=false;
			void marketing(String Quality) {
				if(Quality.equals("a1")) {
					System.out.println("vegetabels are brought...");
				if(marketing) { 
					
				money=money-40;}
				}}
			int getBalanceMoney() {
					return money;
				}
			static void dal() {
				System.out.println("dal is ready...");
			}
			void makerice() {
				System.out.println("Rice is ready");
			}
			Lunch cookhealthy() {
				marketing=true;
				marketing("a1");
				return new Lunch();//???????????????
			}
			void LunchReady() {
				System.out.println("have feast...");
			}
}
class Lunch{	
}