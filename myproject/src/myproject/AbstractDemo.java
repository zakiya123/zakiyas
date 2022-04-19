package myproject;

public class AbstractDemo {
			public static void main(String[] args) {
				DominosPizza dominos= new IndianDominosPizza();
				dominos.makePizza();
				dominos.collectpayment();
				dominos.deliverpizza();
			}
       }
abstract class DominosPizza{
	
	    final public void makePizza() {//template method
			System.out.println("dominos pizza making started....");
			makeDough();
			AddIngredient();
			bakepizza();
			System.out.println("pizza maked as per dominos standared of making pizza...");
		}
		final private void makeDough() {
			System.out.println("dominos secret of making dough...");
		}
		final private void AddIngredient() {
			System.out.println("dominos secret of ingredent added...");
		}
		final private void bakepizza() {
			System.out.println("dominos secret baking....");
		}
		public abstract void deliverpizza();
		public abstract void collectpayment();	
		
 }
class IndianDominosPizza extends DominosPizza{
	     @Override
	      	public void collectpayment() {
	      		System.out.println("collect payment as per indian standard....");
	      		
	      	} 
	     @Override
	    public void deliverpizza() {
	   System.out.println("deliver pizza as per indian standard.....");
	    
	    }
 } 
        