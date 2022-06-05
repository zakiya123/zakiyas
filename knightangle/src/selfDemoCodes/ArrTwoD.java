package selfDemoCodes;

import java.util.Scanner;

public class ArrTwoD {
		public static void main(String[] args) {
//			int aar[][]= {{1,2,3,4},{4,5,5,6,7,8,9},
//					{2,4,3,5,6},{6,6,8,9},{7,8,9,4}};
//			for(int j[]:aar) {
//				for(int s:j) {
//				System.out.print(s+"\t");}
//			System.out.println();}
			Scanner scan =new Scanner(System.in);
			int arr[]=new int[4];
			System.out.println("please enter a value......");
			for(int i=0;i<arr.length;i++) {
				arr[i]=scan.nextInt(); 
				System.out.println(arr[i]+"\t");
			}
			System.out.println();
			
			for(int s:arr) {
				System.out.print(s+"\t");
			}
			System.out.println();
		}
}
