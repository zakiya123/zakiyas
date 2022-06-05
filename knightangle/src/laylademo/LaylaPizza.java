package laylademo;
/*agar hamlog koi class me string variable lete hai to,ur
 * usi class me string method returnable lete hai with parameter
 * to ur return string karte hai
 *  local direct instance variable  ko refer karta hai 
 * uski value ko print karta hai..
 */
public class LaylaPizza {
		public static void main(String[] args) {
		DominosPizza dominos=new DominosPizza();
		dominos.makepizza();
		}
}
class DominosPizza{
	String s="makeingPizza.....:";
	public void makepizza() {
	
	System.out.println("____________________________________");
	s=s+makeFloor(s)+"\n";
	
	
	System.out.println("____________________________________");
	s=s+makeIngrident(s)+"\n";
	
	System.out.println("____________________________________");
	s=s+bakePizza(s)+"\n";
	
	System.out.println(s);
	
	System.out.println("yeppeppepeeieieiyyy");
	}
	public String makeFloor(String s) {
		//this.s=z;
		return s+"Floor Processed";
	}
	public String makeIngrident(String s) {
		return s+"IngredientProcessed..";
	}
	public String bakePizza(String s) {
		return s+"pizza baked......";
	}
	
	
}