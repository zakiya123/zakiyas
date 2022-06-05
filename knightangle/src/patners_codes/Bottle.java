package patners_codes;

public class Bottle {
	public Bottle() {
		 String Bottle[]={"Plastic","Stainless Steel","Copper","Glass"};
		 System.out.println("Water Bottle Material can be of any type are as follows:");
			for(int i=0;i < Bottle.length;i++) {
				System.out.println(Bottle[i]);
			}
			System.out.println("I Choose "+Bottle[3]+"..out of all");
	 }
		public static void main(String[] args) {
		Waterbottle buy =new Waterbottle();
		buy.BottleDetails();

		}

	}
	class Waterbottle extends Bottle{
			
		void BottleDetails()
		{
			int BottleCapacity= 3;//3litres.
			float BottleHeight= 12.5f ;//12inches.
			String BottleBrand= "John Lewis";
			String BottleColor="Transparent";
			System.out.println("The capacity of the Bottle is--"+BottleCapacity+"Ltrs..");
			System.out.println("The Height of the Bottle is--"+BottleHeight+"inches.");
			System.out.println("The Brand of the Bottle is--"+BottleBrand);
			System.out.println("The Color of the Bottle is--"+BottleColor);
				}
	}
	class Drinkbottle extends Bottle{
		
	}

