package myproject;

import java.util.Scanner;

public class Biryani {
			
			public static void main(String[] args) {
			Other_Ing OI=new Other_Ing();
			Marination Mt=new Marination("All");
			Rice Rs=new Rice("BasmatiRice");
			Assembling As= new Assembling();
			Dum_Biryani db=new Dum_Biryani("red");
			Biryani BombayBiryani=new Biryani();
			System.out.println(Mt.Marination);
			System.out.println(Rs.BasmatiRice);
			System.out.println(db.Sprinkle);
			System.out.println("succes");
			}}
class Marination {
	String Marination;
	public Marination(String MarinatingBiryani) {
		this.Marination=MarinatingBiryani;
		
		System.out.println("Marination completed...stage 1");
	
}}
class Rice{String BasmatiRice;
	public Rice(String BasmatiRice) {
		this.BasmatiRice=BasmatiRice;
		System.out.println("BasmatiRice is boiled...stage 2");
	}
}
class Assembling{
	boolean RiceOnMarination=false;
	public Assembling() {
		int x=0;
		if ( x==0) {
			RiceOnMarination=true;
		            }
		System.out.println("Assembling completed stage3");
	
}}
class Dum_Biryani{
	String Sprinkle;
	public Dum_Biryani(String sprinkle) {
		this.Sprinkle=sprinkle;
		System.out.println("dum_Biryani is ready stage 4");
		System.out.println("have a feast....");
	}
}
class Other_Ing{
	public Other_Ing() {
	System.out.println("other_ing cons called pre_stage");	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter ingredent....");  
	 String ingredent[]=new String[2]; 
	
	 for(int i=0;i<ingredent.length;i++)
	 ingredent[i] =scan.next(); 
	 for(String x:ingredent) {
	 
	  System.out.print(x+"");
	  System.out.println();}
	  System.out.println("other ingredents completed....");
}}
