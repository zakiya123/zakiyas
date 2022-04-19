package myproject;

public class SirRevision {
		public static void main(String[] args) {
		SirRevision kids=new SirRevision();
		Bag mybag=kids.buyBag();
		System.out.println(mybag);
		System.out.println(kids.getBalanceMoney());
		}
		int money=1000;
		boolean purchase=false;
		void spendMoney(String quality) {
			if(quality.equals("a1")) {
			System.out.println("I want to spend 500");	
			if(purchase) {
				money=money-500;
			}
			}
			else if(quality.equals("a2")) {
				System.out.println("I want to spend 300");
				if(purchase) {
					money=money-300;
				}
			}
		}
		int getBalanceMoney() {
			return money;
		}
		Bag buyBag() {
			purchase=false;
			spendMoney("a2");
			return new Bag();
		}
}
class Bag{
	
}