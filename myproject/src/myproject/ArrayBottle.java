package myproject;

import java.util.Scanner;

public class ArrayBottle {
				public static void main(String[] args) {
					ABSize abs=new ABSize();
					abs.bs();
					System.out.println("sucess");
					shapes sh = new shapes();
					sh.ss();
					System.out.println("shapes success.....");
				}
}
class ABSize{
	void bs() {
	int arr[]= {10,20,30,40,50};	
	for(int b=0;b<arr.length-2;b++) {
		System.out.println("1 liter bottle created"+ "::::");
	}
	
}}
class shapes{
	void ss() {
	String arr[]=new String[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter a value...");
	String b="empty";
	for(int i=0;i<arr.length-3;i++) {
	arr[i]=sc.next();	
	}
	for(String bb:arr) {
	 b=b+bb;
	}
	System.out.println("success1"+":::::"+arr[1]);
			
	
	
	
}}