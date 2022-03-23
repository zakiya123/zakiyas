package knightangle;

import java.util.Scanner;

public class InPutFromKeyboard {
		public static void main(String[] args) {
			Scanner zak=new Scanner(System.in);
			System.out.println("please enter a number...........");
			int j=zak.nextInt();
			System.out.println((j<=6)?"even number************":"odd number......");
			
		//	for(int o=0,v=8;o<=v&&v>=o;o++,v--) {
		//		System.out.println(o+":"+v);
		//	}
			while(j*10==80){
				if(j%2==0){
					System.out.println("even number...."+j);
			     
				
				}break;
				
			}System.out.println("zaki win............$$$");
			
			do{
				if( j==1) {
					System.out.println("************%%%%%%");
				}j++;
				System.out.println(j);
			}while(j<10);
			System.out.println(j+":::::::::::::");
			}
			}
		

