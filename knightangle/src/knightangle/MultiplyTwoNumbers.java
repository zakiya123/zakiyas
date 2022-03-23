package knightangle;

import java.util.Scanner;

public class MultiplyTwoNumbers {
			public static void main(String[] args) {
				Scanner input= new Scanner(System.in);
				System.out.println("Please enter a value for k and l");
				int k=input.nextInt();
				int l=input.nextInt();
				System.out.println(k+"::::::::::::::::"+l);
				int sum=k*l;
				System.out.println(sum);
			}
}
