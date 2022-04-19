package myproject;

import java.util.Scanner;

public class ArrayResult {
		public static void main(String[] args) {
			int yes=1;
		    Scanner scan=new Scanner(System.in);
			do {
		    System.out.println("Please Enter Name: and Roll_No:");
			String N;
			N=scan.next();
			String R;
			R=scan.next();
			System.out.println("Enter English marks");
			int eng=scan.nextInt();
			System.out.println("Enter Maths marks");
			int mat=scan.nextInt();
			System.out.println("Enter Science marks");
			int sci=scan.nextInt();
			System.out.println("Enter Economic marks");
			int eco=scan.nextInt();
			System.out.println("|_____________________________Result_____________________________|");
			
		String S="Stream: Arts";
		System.out.println(N+"\t"+R+"\t"+S);
		
		System.out.println("Subjects"+"\t"+"MarksObtain"+"\t"+"TotalMarks");
		String Eng="English";
		
		String Mat="Maths";
		
		String Sci="Science";
		
		String Eco="Economic";
		
		int Tm=100;
		double Av=(eng+mat+sci+eco)/4.0;
		int ast=400;
		double P=(eng+mat+sci+eco)/4.0;
		System.out.print(Eng+"\t"+"\t"+eng+"\t"+"\t"+Tm+"\n");
		
		System.out.print( Mat+"\t"+"\t" +mat+"\t"+"\t"+Tm+"\n");
		
		System.out.print(Sci+ "\t"+"\t" + sci+"\t"+"\t"+Tm+"\n");
		
		System.out.print(Eco+"\t"+eco+"\t"+"\t"+Tm+"\n");
		
		System.out.println("-----------------------------------------");
		System.out.println("Avreage"+"\t"+Av);
		System.out.println("Percentage"+P+"%");
		System.out.println("Do You Want to Continue?....Type \'Yes\'....type \'no\' to terminate.");
		                        }
		while(yes<2);
		}}
 