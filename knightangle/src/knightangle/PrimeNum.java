package knightangle;

import java.util.Scanner;

public class PrimeNum {
			public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				System.out.println("enter a value for i.......");
				int i=scan.nextInt();
				System.out.println("enter a value for k.....");
				int k=scan.nextInt();
				if(i%4==0) {
				System.out.println("i is an integer..."+i);	
				}
				else {
					System.out.println("k is an integer....."+k);
				}
			}
}
