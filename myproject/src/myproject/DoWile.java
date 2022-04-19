package myproject;

//import java.util.Scanner;

public class DoWile {
			public static void main(String[] args) {
			//Scanner	scan=new Scanner(System.in);
//			int arr[]={23,45,65};for(int i=0;i<arr.length;i++){
//			System.out.println("enter the element[0]"+arr[i]);}
//			//int arr[]=new int[5]; 
//			for(int i:arr) {
//				System.out.println(i);
//			}
//			int sum=0;
//			for(int num:arr) {
//				sum=sum+num;}
//				System.out.println(sum);		
				int[][]twoarr= {{45,65,78},
						        {34,56,77},{74,75,72,35}};
				for(int i=0;i<twoarr.length;i++) {
					for(int j=0;j<twoarr[i].length;j++) {
					System.out.print(twoarr[i][j]+"\t");	
					}
					System.out.println();
					
				}int sum=0;
				for(int num[]:twoarr) {
					for(int j:num) {
					sum=sum+j;}}
				
				System.out.println(sum);
//				for(int i[]:twoarr) {
//					for(int j:i) {
//						System.out.println(j+"\t");
//					}
//					System.out.println();
//				}
}
}