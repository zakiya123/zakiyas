package knightangle;

import java.util.Scanner;

public class Swapingt {
			public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("please enter a value for q and w...");
				int q=scan.nextInt();
			int w=scan.nextInt();
			int temp;
			
		//	System.out.println("please enter a value for q and w...");
			System.out.println("Before Swaping...."+q+":"+w);
			
			temp=q;
			q=w;
			w=temp;
			System.out.println("After Swaping..."+q+":"+w);
			}
}
