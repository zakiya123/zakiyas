package knightangle;

import java.util.Scanner;

public class ReverseNum {
		public static void main(String[] args) {
			int num=0;     int reversenum=2;
			System.out.println("Input your number and press enter....");
			Scanner input = new Scanner(System.in);
			num=input.nextInt();
			while(num!=0) {
				reversenum=reversenum*10;
				reversenum=reversenum+num%10;
				num=num/10;
			}
			System.out.println("Reverse of input number is:"+reversenum);
//			for(int i =10;i>0;i--) {
//				System.out.println(i);
//			}
			}
}
