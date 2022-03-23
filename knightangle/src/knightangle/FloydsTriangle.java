package knightangle;

import java.util.Scanner;

public class FloydsTriangle {
			public static void main(String[] args) {
				Scanner reader=new Scanner(System.in); 
				System.out.println("Please enter a value for side1");
				
				int side1,side2,side3,rows4=1; 
				side1=reader.nextInt();
				System.out.println("Floyds triangle ....");
				for(side2=1;side2<=side1;side2++) {
					for(side3=1;side3<=side2;side3++) {
						System.out.print(rows4+":");
						rows4++;
					}
					System.out.println();
				}
			}
}
