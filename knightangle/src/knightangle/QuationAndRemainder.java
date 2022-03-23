package knightangle;

import java.util.Scanner;

public class QuationAndRemainder {
		public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Please enter a value");
			byte b=reader.nextByte();
			byte z=reader.nextByte();
			System.out.println(b+"::::::::::::"+z);
			int  Q = b/z;
			System.out.println("The Quetion of b and z is"+":::::::::::"+Q);
			int R = b%z;
			System.out.println("The Remainder of b and z is"+"::::::::"+R);
		}
}
