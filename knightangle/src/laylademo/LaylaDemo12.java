package laylademo;

 public class LaylaDemo12 {
		public static void main(String[] args) {
		dominos Dominos=new ChennaiDominos();
		Dominos.getPayment();
		Dominos.delivery();
		}
 }
 abstract class dominos{
	public abstract void delivery();
	public abstract void getPayment();
	final public void makeDough() {
		System.out.println("dough is made as per dominos.......");
	}
	final public void makeIngredients() {
		System.out.println("dominos was of making ingredients......");
	}
	final public void packing() {
		System.out.println("dominos way of packing.....");
	}
	final public void baking() {
		System.out.println("dominos way of baking.....");
	}
	final public void makePizza() {
		makeDough();
		baking();
		makeIngredients();
		packing();
	}
 }
 class ChennaiDominos extends dominos{

	@Override
	public void delivery() {
	makePizza();
	System.out.println("done delivery throught bike ....in chennai....");
	}
	@Override
	public void getPayment() {
			System.out.println("Payment recived.....");
	}
 }