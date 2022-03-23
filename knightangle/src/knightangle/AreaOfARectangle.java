package knightangle;

import java.util.Scanner;

public class AreaOfARectangle {
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle...");
		int length=scan.nextInt();
		System.out.println("Enter a width of  Rectangle...");
		int width=scan.nextInt();
		int area=length*width;
		System.out.println(area);
		}
}
