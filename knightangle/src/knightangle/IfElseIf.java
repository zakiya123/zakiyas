package knightangle;

public class IfElseIf {
			public static void main(String[] args) {
			//my object is too print even numbers .......
				int i=2;int v=6;
				if(i>4) {
					System.out.println("even numbers....");
				}
				else if(i==v) {
					System.out.println("*********");
				}
				else {
				System.out.println(i+"************"+v);	
				}
				//Ternary operator
				System.out.println((v%i==0)?"even number":"odd number");
			}
}
