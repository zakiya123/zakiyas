package knightangle;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a with of a triangle...");
		double width=scan.nextDouble();
		System.out.println("Enter a side of a triangle...");
		double side=scan.nextDouble();
		double area=(width*side)/2;
		System.out.println(area);
	}

}
