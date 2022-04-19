package myproject;

import java.util.Scanner;

public class AnjumModifieCode {
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		char choice;
		do {
		System.out.println("Entering Marks of the Students of VTU");
		System.out.println("Enter Student Name");
		String name=scan.next();
		System.out.println("Enter Student USN");
		String usn=scan.next();
		System.out.println("Enter the marks of Data Structuresand Algorithms");
		int dsa=scan.nextInt();
		System.out.println("Enter the marks of Machine Learning");
		int ml=scan.nextInt();
		System.out.println("Enter the marks of Storage Area Networks");
		int san=scan.nextInt();
		System.out.println("Enter the marks of Computer Graphics");
		int cg=scan.nextInt();
		System.out.println("Enter the marks of Python Applications ");
		int py=scan.nextInt();
		
		System.out.println("...........Declaration of Result of Visveswaraya Technological University,Belgavi...........");
		
		String stream="Stream: Computer Science and Engineering";
		System.out.println("Name:"+name +"\t" + "USN:"+usn +"\t" + stream);
		System.out.println();
		System.out.println("Subject Code" + "\t" + "Subjects" + "\t"+"\t" + "Marks Assigned" + "\t"+ "Marks Obtained");
		String sc1="15cs001";
		String sc2="15cs002";
		String sc3="15cs003";
		String sc4="15cs004";
		String sc5="15cs005";
		
		String Dsa="Data Structures";
		String Ml="Machine Learning";
		String San="Storage Area Networks";
		String Cg="Computer Graphics";
		String Py="Python Applications";
		int As=100;
		int Tma=500;
		double avg=(dsa+ml+san+cg+py)/5.0;
		double p=(dsa+ml+san+cg+py)/5.0;
		System.out.println(sc1 +"\t"+"\t"+ Dsa + "\t"+"\t"+"\t"+ As + "\t" + dsa);
		System.out.println();
		System.out.println(sc2 +"\t"+"\t"+ Ml + "\t"+"\t"+ As + "\t" + ml);
		System.out.println();
		System.out.println(sc3 +"\t"+"\t"+ San + "\t"+"\t"+ As + "\t" + san);
		System.out.println();
		System.out.println(sc4 +"\t"+"\t"+ Cg + "\t"+"\t"+ As + "\t" + cg);
		System.out.println();
		System.out.println(sc5 +"\t"+"\t"+ Py + "\t"+"\t"+ As + "\t" + py);
		System.out.println();
		System.out.println("____________");
		System.out.println("Avreage"+"\t"+avg);
		System.out.println("Percentage"+"\t"+p+"%");
		String remark;
		if(avg>=80) {
			remark="Distinction";
		}
		else if(avg>=60 && avg<80) {
			remark="First class";
		}
		else if(avg>=40 && avg<60) {
			remark="Second class";
		}
		else {
			remark="Fail";
			}
		System.out.println("Remark"+"\t"+ remark );
		System.out.println();
		System.out.println("\tdo you want to continue to enter the details and marks(Type y or n) :");
		choice=scan.next().charAt(0);
		}
		while(choice=='Y'||choice=='y');
		}
	}

