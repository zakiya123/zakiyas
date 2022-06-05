package myproject;

public class MyBag {
	
		public static void main(String[] args) {
			MyBag abdurrehman=new MyBag();
			Bag1 mybag=abdurrehman.buyBag();
			System.out.println(mybag);
			System.out.println(abdurrehman.getBalanceMoney());
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
		
		Bag1 buyBag() {
			purchase=true;
			spendMoney("a1");
			
			return new Bag1();
		}
	}
	class Bag1{}

