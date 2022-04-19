package myproject;

public class VarArgs {
			static void vaTest(int...v) {
				System.out.println("Number of args:"+v.length+"*"+"Contents:");
				for(int x:v)
					System.out.print(x+"");
				System.out.println();
				
			}
			public static void main(String[] args) {
				vaTest(10);
				vaTest(1,2,3);
				vaTest();
				vaTest(1,8,9,4,5,6);
				
			}
}
