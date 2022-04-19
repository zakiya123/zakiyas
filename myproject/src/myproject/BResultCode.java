package myproject;

import java.util.Scanner;

public class BResultCode {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		boolean reinitilizedpro=false;
		do {
		System.out.print("enter number of students :");
		int numberofstudent=scan.nextInt();
		String []sname=new String[numberofstudent];
		int srollno[]=new int [numberofstudent];
		int submark1[]=new int [numberofstudent];
		int submark2[]=new int [numberofstudent];
		int submark3[]=new int [numberofstudent];
		double[] percent=new double [numberofstudent];
		
		System.out.println();
	for(int num=0;num<numberofstudent;num++)	{
		
		System.out.println("enter number of "+( num+1)+"student details ");
		System.out.println("|___________________|");
		System.out.print("enter Sname of student :");
		sname [num]=scan.next();
		System.out.println("|___________________|");
		System.out.print("enter sRoll of student :");
		srollno [num]=scan.nextInt();
		scan.nextLine();
		System.out.println("|___________________|");
		System.out.print("enter english subject marks :");
		submark1 [num]=scan.nextInt();
		System.out.println("|___________________|");
		System.out.print("enter physics subject marks :");
		submark2 [num]=scan.nextInt();
		System.out.println("|___________________|");
		System.out.print("enter mathematic subject marks:");
		submark2 [num]=scan.nextInt();	
		System.out.println("|___________________|");
	    percent[num]=(submark1[num]+submark2[num]+submark3[num])/3.0;
	    System.out.println("percent :"+percent[num]);
	}
	System.out.println("name"+"\t"+"roll"+"\t"+"remark");
	for(int grade=0;grade<numberofstudent;grade++) {
		String remark;
	if(percent[grade]<40) {
		remark="poor"; 
		}else if(percent[grade]<60){
			remark="good";
		}else if(percent[grade]<80){
			remark="firstclass";
		}else {
			remark="distination";
		}
	System.out.println(sname[grade]+"\t"+srollno[grade]+"\t"+remark);
	}

		}while(reinitilizedpro=true) ;
		System.out.println();
	}
	}

