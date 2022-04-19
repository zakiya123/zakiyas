package classexcercise;

import java.util.Scanner;

public class AnjumResultDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of students:  ");
		int num_Of_Students=scan.nextInt();
		int rollNo[]=new int[num_Of_Students];
		String name[]=new String[num_Of_Students];
		int s1[]=new int[num_Of_Students];
		int s2[]=new int[num_Of_Students];
		int s3[]=new int[num_Of_Students];
		double avg[]=new double[num_Of_Students];
		
		for(int i=0;i<num_Of_Students;i++) {//num of stud is zero here
			System.out.println("Enter student " + (i+1) +"-"+"details:");
			
			//scan.nextLine();
			System.out.print("Name: ");
			
			name[i]=scan.next();
			System.out.print("Roll No:");
			rollNo[i]=scan.nextInt();
			System.out.print("Subject 1 Marks: ");
			s1[i]=scan.nextInt();
			System.out.print("Subject 2 Marks: ");
			s2[i]=scan.nextInt();
			System.out.print("Subject 3 Marks: ");
			s3[i]=scan.nextInt();
					
			avg[i]=(s1[i]+s2[i]+s3[i])/3;   //100
			
		}
		System.out.println(" Name\tRoll No\tRemark");
		for(int i=0;i<num_Of_Students;i++)
		                    {
			String remark;
			if(avg[i]<40)
				remark="Poor";
			else if(avg[i]<60)
				remark="Pass";
			else if(avg[i]<75)
				remark="First Class";
			else if(avg[i]<85)
				remark="Distinction";
			else
				remark="Excellent";
			System.out.println(rollNo[i]+ "\t" +name[i] + "\t" + remark );	
			}         
		}     
	}              
