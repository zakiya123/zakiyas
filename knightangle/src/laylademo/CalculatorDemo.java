package laylademo;

public class CalculatorDemo {
		public static void main(String[] args) {
		Calculator calci=new Calculator();
		calci.setNumbers(6,4);
		System.out.println("addition is......:"+calci.getAddition());
		System.out.println("subraction is......:"+calci.getSubraction());
		System.out.println("multiplication is......:"+calci.getMultiplication());
		}
}
class Calculator{
	int n1,n2;
	public void setNumbers(int num1,int num2) {
		n1=num1;n2=num2;
	}
	public int getAddition() {
	return n1+n2;	
	}
	public int getSubraction() {
		return n1-n2;	
		}
	public int getMultiplication() {
			return n1*n2;	
		}
}