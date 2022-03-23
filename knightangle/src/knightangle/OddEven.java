package knightangle;

import java.util.Scanner;

public class OddEven {
			public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				System.out.println("Please enter a value for d....");
				int d=scan.nextInt();
				if(d%2==0) {
					System.out.println("d is even number...");
				}
				else {
					System.out.println("Odd number....");
				}
			}
}
