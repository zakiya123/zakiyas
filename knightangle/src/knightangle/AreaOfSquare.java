package knightangle;

import java.util.Scanner;

public class AreaOfSquare {
		 public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter a value for square...");
			double side=scan.nextDouble();
			double area=side*side;
			System.out.println(area);
		}
}
