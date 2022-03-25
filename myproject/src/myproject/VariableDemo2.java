package myproject;

public class VariableDemo2 {
		public static void main(String[] args) {
			Bottle Voiletbottle = new Bottle(new Colour("voilet"));
			//voiletbottle.colour=new Colour();
		//	Bottle Voiletbottel=new Bottle();
			Bottle Bluebottle=new Bottle(new Colour("Blue"));
			//bluebottle.colour=new Colour();
			
			System.out.println(Voiletbottle.colour.colour);
		//	System.out.println(Voiletbottel);
			System.out.println(Bluebottle.colour.colour);
		}						
}
class Bottle{
	Colour colour;					
	 Bottle(Colour colour) {			
		this.colour=colour;
	}}

class Colour{
	String colour;
	Colour(String colour){
		this.colour=colour;
	}
}