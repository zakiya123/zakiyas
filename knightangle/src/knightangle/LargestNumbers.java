package knightangle;

import java.util.Scanner;

public class LargestNumbers {
			public static void main(String[] args) {
				Scanner good = new Scanner(System.in);
				System.out.println("Please enter a value for z s y");
				short z=good.nextShort();
				short s=good.nextShort();
				short y=good.nextShort();
				if(z>=s&&z>=y) {
					System.out.println("Z is the largest number...");
				}
				else if(s>z&&s>y) {
					System.out.println("S is the largest number**");
				}
				else {
					System.out.println("Y is the largest number$$$$");
				}
			}
}
